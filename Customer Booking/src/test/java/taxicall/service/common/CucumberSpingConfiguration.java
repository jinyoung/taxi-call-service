package taxicall.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxicall.service.CustomerBookingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerBookingApplication.class })
public class CucumberSpingConfiguration {}
