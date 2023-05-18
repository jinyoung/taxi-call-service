package taxicall.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxicall.service.RideManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RideManagementApplication.class })
public class CucumberSpingConfiguration {}
