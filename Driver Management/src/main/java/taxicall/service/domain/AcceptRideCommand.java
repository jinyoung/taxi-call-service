package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AcceptRideCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String bookingId;
}
