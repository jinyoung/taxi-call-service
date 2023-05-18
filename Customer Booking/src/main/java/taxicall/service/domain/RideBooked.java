package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class RideBooked extends AbstractEvent {

    private String customerId;
    private String bookingId;

    public RideBooked(Booking aggregate) {
        super(aggregate);
    }

    public RideBooked() {
        super();
    }
}
