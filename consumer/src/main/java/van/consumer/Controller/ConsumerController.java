package van.consumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.ProviderService;

@RestController
public class ConsumerController {
    @Reference
    private ProviderService providerService;

    @RequestMapping("hello")
    public String hello() {
        return providerService.sayHello();
    }
}
