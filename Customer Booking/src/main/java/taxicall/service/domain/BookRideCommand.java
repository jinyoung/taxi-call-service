package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class BookRideCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String pickupLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String dropoffLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String paymentType;
}
