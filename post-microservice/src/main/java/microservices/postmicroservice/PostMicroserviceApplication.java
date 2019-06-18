package microservices.postmicroservice;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class PostMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostMicroserviceApplication.class, args);
    }

    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }


}
