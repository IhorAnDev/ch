package HW.Hotel.Service;

import HW.Hotel.Entity.Bill;
import HW.Hotel.Entity.Client;
import HW.Hotel.Entity.Hotel;
import HW.Hotel.Entity.Room;

import java.util.List;

public class BookingService {

    public void book(Hotel hotel, Client client, int kolichestvoChelovek) {

        List<Room> rooms = hotel.getRoom();

        boolean isFreeRooms = false;

        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }

        if (!isFreeRooms) {
            System.out.println("net svobodnix nomerov v otele " + hotel.getHotelName());
        }

        bookOrder(client, kolichestvoChelovek, rooms);

    }

    private void bookOrder(Client client, int kolichestvoChelovek, List<Room> rooms) {
        boolean success = false;
        String nameClient = client.getName();
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == kolichestvoChelovek && room.isFree()) {
                success = true;
                System.out.println("Est nomer po zaprosu klienta " +
                        nameClient);
                if (client.getSchetClienta().getSummaScheta() >= room.getStoimostNomera()) {
                    Bill clientSchet = client.getSchetClienta();
                    clientSchet.setSummaScheta(clientSchet.getSummaScheta() -
                            room.getStoimostNomera());
                    room.setFree(false);
                    System.out.println("Nomer bil speshno zabroirovan klientom " +
                            nameClient);
                } else {
                    System.out.println("ne dostatocno deneg na chetu klienta " +
                            nameClient);
                }
            }
        }
        if (!success) {
            System.out.println("Net svobodnogo nomera dlya " +
                    nameClient);
        }
    }
}
