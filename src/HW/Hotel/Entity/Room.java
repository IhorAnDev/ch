package HW.Hotel.Entity;

public class Room {

    private int numberOfPerson;

    private int stoimostNomera;

    private boolean free;

    public Room(int numberOfPerson, int stoimostNomera, boolean free) {
        this.numberOfPerson = numberOfPerson;
        this.stoimostNomera = stoimostNomera;
        this.free = free;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getStoimostNomera() {
        return stoimostNomera;
    }

    public void setStoimostNomera(int stoimostNomera) {
        this.stoimostNomera = stoimostNomera;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
