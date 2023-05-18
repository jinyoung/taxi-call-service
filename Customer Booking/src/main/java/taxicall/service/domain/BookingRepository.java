package taxicall.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxicall.service.domain.*;

@RepositoryRestResource(collectionResourceRel = "bookings", path = "bookings")
public interface BookingRepository
    extends PagingAndSortingRepository<Booking, String> {}
