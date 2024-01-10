package Services;

import Models.ParkingLot;
import Models.Slot;
import Repositories.ParkingLotRepository;

import java.util.List;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot getParkingLot(Long gateId) {
        return parkingLotRepository.getParkingLot(gateId);
    }

    public List<Slot> getSlots(Long parkingLotId) {

        return null;
    }

}
