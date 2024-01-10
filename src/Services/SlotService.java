package Services;

import Repositories.SlotRepository;

public class SlotService {
    private SlotRepository slotRepository;

    public SlotService(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    public void markParkingSpotAsOccupied(Long slotId, Long parkingLotId) {
        //
    }
}
