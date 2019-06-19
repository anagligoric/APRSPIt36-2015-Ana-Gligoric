package microservices.deletemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeleteMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeleteMicroserviceApplication.class, args);
    }

}
