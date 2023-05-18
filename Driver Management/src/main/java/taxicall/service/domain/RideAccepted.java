package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class RideAccepted extends AbstractEvent {

    private String driverId;
    private String bookingId;

    public RideAccepted(Driver aggregate) {
        super(aggregate);
    }

    public RideAccepted() {
        super();
    }
}
