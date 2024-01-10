package Services;

import Models.*;
import Repositories.TicketRepository;
import Strategies.SlotAllocationStrategy.SlotAllocationStrategy;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private SlotService parkingSpotService;
    private TicketRepository ticketRepository;
    private ParkingLotService parkingLotService;

    public TicketService(VehicleService vehicleServic, GateService gateService,
                         SlotService parkingSpotService,
                         TicketRepository ticketRepository,
                         ParkingLotService parkingLotService) {
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.parkingSpotService = parkingSpotService;
        this.ticketRepository = ticketRepository;
        this.parkingLotService = parkingLotService;
    }

    public Ticket generateTicket(String vehicleNumber,
                                 VehicleType vehicleType, Long gateId) {

        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);

        if (vehicle == null) {
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        Ticket ticket = new Ticket();

        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getOperator());

        ParkingLot lot = this.parkingLotService.getParkingLot(gateId);

        SlotAllocationStrategy strategy = lot.getSpotAssignmentStrategy();

        //Assign the Parking Spot.
        Slot slot = strategy.assignParkingSpot(vehicleType, gate);

        slot.setSlotStatus(SlotStatus.OCCUPIED);
        parkingSpotService.markParkingSpotAsOccupied(slot.getId(),lot.getId());

        ticket.setSlot(slot);

        ticket = ticketRepository.saveTicket(ticket);

        return ticket;
    }
}
