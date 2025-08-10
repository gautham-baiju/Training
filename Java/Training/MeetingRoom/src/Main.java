package Java.Training.MeetingRoom.src;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // create meeting rooms
        MeetingRoom mr1 = new MeetingRoom(1, 10, "mango");
        MeetingRoom mr2 = new MeetingRoom(2, 11, "apple");

        LocalDate bookingDate1 = LocalDate.of(2023, 5, 12);
        LocalDate bookingDate2 = LocalDate.of(2023, 5, 13);
        LocalDate bookingDate3 = LocalDate.of(2024, 5, 13);
        LocalDate bookingDate4 = LocalDate.of(2025, 5, 13);

        // booking meetings
        String message1 = mr1.bookMeetingRoom(1, bookingDate1);
        System.out.println(message1);
        String message2 = mr1.bookMeetingRoom(3, bookingDate1);
        System.out.println(message2);
        String message3 = mr1.bookMeetingRoom(5, bookingDate2);
        System.out.println(message3);

        // deactivating meeting rooms
        String message7 = mr1.deactivateMeetingRoom();
        System.out.println(message7);
        String message8 = mr1.bookMeetingRoom(1, bookingDate3);
        System.out.println(message8);
        String message9 = mr1.bookMeetingRoom(3, bookingDate4);
        System.out.println(message9);

        // activating meeting rooms
        String message10 = mr1.activateMeetingRoom();
        System.out.println(message10);
        String message11 = mr1.bookMeetingRoom(1, bookingDate3);
        System.out.println(message11);
        String message12 = mr1.bookMeetingRoom(3, bookingDate4);
        System.out.println(message12);

        String message4 = mr2.bookMeetingRoom(1, bookingDate1);
        System.out.println(message4);
        String message5 = mr2.bookMeetingRoom(3, bookingDate1);
        System.out.println(message5);
        String message6 = mr2.bookMeetingRoom(5, bookingDate2);
        System.out.println(message6);

        // display booking details
        HashSet<Booking> bookings1 = mr1.displayBookings();
        HashSet<Booking> bookings2 = mr2.displayBookings();

        System.out.println("Bookings for MR 1");
        for (Booking booking : bookings1) {
            System.out.println(booking.bookedBy);
            System.out.println(booking.bookingDate);
        }

        System.out.println("Bookings for MR 2");
        for (Booking booking : bookings2) {
            System.out.println(booking.bookedBy);
            System.out.println(booking.bookingDate);
        }
    }
}
