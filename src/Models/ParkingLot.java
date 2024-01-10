package Models;

import Strategies.SlotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private String name;
    private String address;

    private SlotAllocationStrategy spotAssignmentStrategy;

    public SlotAllocationStrategy getSpotAssignmentStrategy() {
        return spotAssignmentStrategy;
    }

    public void setSpotAssignmentStrategy(SlotAllocationStrategy spotAssignmentStrategy) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public List<Floor> getParkingFloors() {
        return floors;
    }

    public void setParkingFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
