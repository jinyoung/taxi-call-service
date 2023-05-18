package taxicall.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CompleteRideCommand {

    private String bookingId;
    private String paymentType;
}
