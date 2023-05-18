package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxicall.service.CustomerBookingApplication;
import taxicall.service.domain.RideBooked;
import taxicall.service.domain.RideCancelled;

@Entity
@Table(name = "Booking_table")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerId;

    private String pickupLocation;

    private String dropoffLocation;

    private String paymentType;

    private String status;

    @PostPersist
    public void onPostPersist() {
        RideBooked rideBooked = new RideBooked(this);
        rideBooked.publishAfterCommit();

        RideCancelled rideCancelled = new RideCancelled(this);
        rideCancelled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static BookingRepository repository() {
        BookingRepository bookingRepository = CustomerBookingApplication.applicationContext.getBean(
            BookingRepository.class
        );
        return bookingRepository;
    }
}
