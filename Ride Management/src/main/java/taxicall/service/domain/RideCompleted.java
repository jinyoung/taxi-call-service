package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class RideCompleted extends AbstractEvent {

    private String bookingId;

    public RideCompleted(Ride aggregate) {
        super(aggregate);
    }

    public RideCompleted() {
        super();
    }
}
