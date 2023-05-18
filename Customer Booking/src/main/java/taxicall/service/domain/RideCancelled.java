package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class RideCancelled extends AbstractEvent {

    private String bookingId;

    public RideCancelled(Booking aggregate) {
        super(aggregate);
    }

    public RideCancelled() {
        super();
    }
}
