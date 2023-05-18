package taxicall.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxicall.service.domain.*;

@RepositoryRestResource(collectionResourceRel = "drivers", path = "drivers")
public interface DriverRepository
    extends PagingAndSortingRepository<Driver, String> {}
