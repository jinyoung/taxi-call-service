package taxicall.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxicall.service.domain.*;

@Component
public class RideHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ride>> {

    @Override
    public EntityModel<Ride> process(EntityModel<Ride> model) {
        return model;
    }
}
