package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxicall.service.RideManagementApplication;
import taxicall.service.domain.RideCompleted;
import taxicall.service.domain.RideStarted;

@Entity
@Table(name = "Ride_table")
@Data
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bookingId;

    private String pickupLocation;

    private String dropoffLocation;

    private Double fare;

    private String status;

    @PostPersist
    public void onPostPersist() {
        RideStarted rideStarted = new RideStarted(this);
        rideStarted.publishAfterCommit();

        RideCompleted rideCompleted = new RideCompleted(this);
        rideCompleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RideRepository repository() {
        RideRepository rideRepository = RideManagementApplication.applicationContext.getBean(
            RideRepository.class
        );
        return rideRepository;
    }

    public static void addCall(RideBooked rideBooked) {
        /** Example 1:  new item 
        Ride ride = new Ride();
        repository().save(ride);

        */

        /** Example 2:  finding and process
        
        repository().findById(rideBooked.get???()).ifPresent(ride->{
            
            ride // do something
            repository().save(ride);


         });
        */

    }
}
