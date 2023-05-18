package taxicall.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxicall.service.domain.*;

@Component
public class BookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Booking>> {

    @Override
    public EntityModel<Booking> process(EntityModel<Booking> model) {
        return model;
    }
}
