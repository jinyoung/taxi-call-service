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
    RideRepository rideRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RideBooked'"
    )
    public void wheneverRideBooked_AddCall(@Payload RideBooked rideBooked) {
        RideBooked event = rideBooked;
        System.out.println(
            "\n\n##### listener AddCall : " + rideBooked + "\n\n"
        );

        // Sample Logic //
        Ride.addCall(event);
    }
}
