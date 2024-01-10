package Strategies.SlotAllocationStrategy;

import Models.*;
import Services.ParkingLotService;

import java.util.List;

public class RandomSlotAllocationStrategy implements SlotAllocationStrategy {
    private ParkingLotService parkingLotService;

    public RandomSlotAllocationStrategy(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }
    @Override
    public Slot assignParkingSpot(VehicleType vehicleType, Gate gate) {

        ParkingLot parkingLot = parkingLotService.getParkingLot(gate.getId());

        List<Slot> slots = parkingLotService.getSlots(parkingLot.getId());

        for (Slot slot : slots) {
            if (slot.getSlotStatus().equals(SlotStatus.AVAILABLE) &&
                    slot.getSupportedVehicleTypes().contains(vehicleType)) {
                return slot;
            }
        }

        return null;
    }
}
