package taxicall.service.domain;

import java.util.*;
import lombok.*;
import taxicall.service.domain.*;
import taxicall.service.infra.AbstractEvent;

@Data
@ToString
public class DriverAvailable extends AbstractEvent {

    private String driverId;
    private String currentLocation;

    public DriverAvailable(Driver aggregate) {
        super(aggregate);
    }

    public DriverAvailable() {
        super();
    }
}
