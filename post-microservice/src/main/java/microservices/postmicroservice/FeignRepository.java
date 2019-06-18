package microservices.postmicroservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "get-microservice")
@RibbonClient(name = "get-microservice")
public interface FeignRepository {
    @GetMapping("redniBroj/{id}")
    public Integer redniBroj(@PathVariable("id") int id);
}

