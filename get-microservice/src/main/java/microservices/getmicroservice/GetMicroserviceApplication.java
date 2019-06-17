package microservices.getmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class GetMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetMicroserviceApplication.class, args);
    }

}
