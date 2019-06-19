package microservices.putmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PutMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PutMicroserviceApplication.class, args);
    }

}
