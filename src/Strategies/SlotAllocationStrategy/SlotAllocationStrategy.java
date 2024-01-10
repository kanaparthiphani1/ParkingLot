package Strategies.SlotAllocationStrategy;

import Models.Gate;
import Models.Slot;
import Models.VehicleType;

public interface SlotAllocationStrategy {
    Slot assignParkingSpot(VehicleType vehicleType, Gate gate);
}
