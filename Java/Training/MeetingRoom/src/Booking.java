package Java.Training.MeetingRoom.src;

import java.time.LocalDate;

public class Booking {
    LocalDate bookingDate;
    int bookedBy;

    Booking(LocalDate bookingDate, int employeeId) {
        this.bookingDate = bookingDate;
        this.bookedBy = employeeId;
    }
}
