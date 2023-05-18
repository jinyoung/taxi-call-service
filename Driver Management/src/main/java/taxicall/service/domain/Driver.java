package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxicall.service.DriverManagementApplication;
import taxicall.service.domain.DriverAvailable;
import taxicall.service.domain.RideAccepted;

@Entity
@Table(name = "Driver_table")
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String driverId;

    private String name;

    private Boolean availability;

    private String currentLocation;

    @PostPersist
    public void onPostPersist() {
        RideAccepted rideAccepted = new RideAccepted(this);
        rideAccepted.publishAfterCommit();

        DriverAvailable driverAvailable = new DriverAvailable(this);
        driverAvailable.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DriverRepository repository() {
        DriverRepository driverRepository = DriverManagementApplication.applicationContext.getBean(
            DriverRepository.class
        );
        return driverRepository;
    }
}
