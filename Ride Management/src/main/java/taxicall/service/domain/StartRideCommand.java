package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class StartRideCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String bookingId;
}
