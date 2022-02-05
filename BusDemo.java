package BusResv;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses  = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,false,2));
        buses.add(new Bus(2,true,2));
        buses.add(new Bus(3,false,2));

        int userOption = 1;
       Scanner reader = new Scanner(System.in);
        while(userOption==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOption = reader.nextInt();
            if (userOption==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Seats for the bus in this date is full. Please try another date or bus");
                }
            }
        }
        for(Bus b: buses){
            b.displayBusInfo();
        }
    }
}
