package HW.Hotel.Entity;

import java.util.List;

public class Hotel {

    private String hotelName;

    private List<Room> room;

    public Hotel(String hotelName, List<Room> room) {
        this.hotelName = hotelName;
        this.room = room;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }
}
