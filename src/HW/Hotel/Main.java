package HW.Hotel;

import HW.Hotel.Entity.Bill;
import HW.Hotel.Entity.Client;
import HW.Hotel.Entity.Hotel;
import HW.Hotel.Entity.Room;
import HW.Hotel.Service.BookingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bill andreBill = new Bill(12000);
        Client andreyClient = new Client("Andrey", "Bodnya", "0978563214", "bodya@gmail.com", andreBill);

        Bill sergeyBill = new Bill(10000);
        Client sergeyClient = new Client("Sergey", "Kuzmin", "0936598632", "kuzya@gmail.com", sergeyBill);

        List<Room> kerchHotelRooms = new ArrayList<>();
        kerchHotelRooms.add(new Room(2, 1000, true));
        kerchHotelRooms.add(new Room(4, 2000, true));
        kerchHotelRooms.add(new Room(6, 3000, true));

        Hotel hotelKerch = new Hotel("Kerch", kerchHotelRooms);

        List<Room> dneprHotelRooms = new ArrayList<>();
        dneprHotelRooms.add(new Room(1, 1200, true));
        dneprHotelRooms.add(new Room(3, 22200, true));
        dneprHotelRooms.add(new Room(6, 3400, true));

        Hotel hotelDnepr = new Hotel("Dnepr", dneprHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(hotelKerch,andreyClient,2);
        System.out.println("\n");
        bookingService.book(hotelKerch,andreyClient,7);
        System.out.println("\n");

        bookingService.book(hotelDnepr,sergeyClient,3);

    }
}
