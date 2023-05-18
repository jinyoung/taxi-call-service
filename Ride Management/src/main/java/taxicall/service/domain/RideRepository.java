package taxicall.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxicall.service.domain.*;

@RepositoryRestResource(collectionResourceRel = "rides", path = "rides")
public interface RideRepository
    extends PagingAndSortingRepository<Ride, String> {}
