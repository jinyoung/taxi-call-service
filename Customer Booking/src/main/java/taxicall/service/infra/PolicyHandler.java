package taxicall.service.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import taxicall.service.config.kafka.KafkaProcessor;
import taxicall.service.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    BookingRepository bookingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RideBooked'"
    )
    public void wheneverRideBooked_EmailNotification(
        @Payload RideBooked rideBooked
    ) {
        RideBooked event = rideBooked;
        System.out.println(
            "\n\n##### listener EmailNotification : " + rideBooked + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RideCancelled'"
    )
    public void wheneverRideCancelled_RefundPolicy(
        @Payload RideCancelled rideCancelled
    ) {
        RideCancelled event = rideCancelled;
        System.out.println(
            "\n\n##### listener RefundPolicy : " + rideCancelled + "\n\n"
        );
        // Sample Logic //

    }
}
