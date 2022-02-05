package BusResv;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;


    Booking(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name of passenger");
        passengerName = reader.nextLine();
        System.out.println("Enter bus number");
        busNo = reader.nextInt();
        System.out.println("Enter the date dd-MM-yyyy");
        String dateInput = reader.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }
            int booked = 0;
            for(Booking b: bookings){
                if(b.busNo == busNo && b.date.equals(date)){
                    booked++;
                }
            }
            return booked<capacity?true:false;

}}
