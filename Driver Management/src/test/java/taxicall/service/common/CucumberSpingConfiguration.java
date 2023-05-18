package taxicall.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import taxicall.service.DriverManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DriverManagementApplication.class })
public class CucumberSpingConfiguration {}
