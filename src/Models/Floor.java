package Models;

import java.util.List;

public class Floor extends BaseModel {
    private int number;
    private List<Slot> slots;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}
