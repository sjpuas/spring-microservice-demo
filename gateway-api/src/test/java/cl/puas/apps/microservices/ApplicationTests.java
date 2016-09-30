package cl.puas.apps.microservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GatewayApiApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class ApplicationTests {

    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void testApp() {

    }



}