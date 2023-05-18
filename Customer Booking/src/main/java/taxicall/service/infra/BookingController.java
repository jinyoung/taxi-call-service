package taxicall.service.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxicall.service.domain.*;

@RestController
// @RequestMapping(value="/bookings")
@Transactional
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping(
        value = "bookings/{id}/cancel",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Booking cancelRide(
        @PathVariable(value = "id") String id,
        @RequestBody CancelRideCommand cancelRideCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /booking/cancelRide  called #####");
        Optional<Booking> optionalBooking = bookingRepository.findById(id);

        optionalBooking.orElseThrow(() -> new Exception("No Entity Found"));
        Booking booking = optionalBooking.get();
        booking.cancelRide(cancelRideCommand);

        bookingRepository.save(booking);
        return booking;
    }
}
