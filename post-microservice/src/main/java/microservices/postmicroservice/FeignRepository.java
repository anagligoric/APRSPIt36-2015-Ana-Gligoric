package microservices.postmicroservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("get-microservice")
@RibbonClient("get-microservice")
public interface FeignRepository {
    @GetMapping("num/{id}")
    public Integer num(@PathVariable("id") Long id);
}

