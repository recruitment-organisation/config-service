package recruitment.dev.configservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

class ConfigServiceApplicationTests {

    @Test
    void enablesSpringBootAndConfigServer() {
        org.junit.jupiter.api.Assertions.assertTrue(
                ConfigServiceApplication.class.isAnnotationPresent(SpringBootApplication.class)
        );
        org.junit.jupiter.api.Assertions.assertTrue(
                ConfigServiceApplication.class.isAnnotationPresent(EnableConfigServer.class)
        );
    }

}
