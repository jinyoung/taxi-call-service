package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class RideStarted extends AbstractEvent {

    private String bookingId;
    private String pickupLocation;
    private String dropoffLocation;

    public RideStarted(Ride aggregate) {
        super(aggregate);
    }

    public RideStarted() {
        super();
    }
}
