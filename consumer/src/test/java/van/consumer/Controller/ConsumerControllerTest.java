package van.consumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import provider.ProviderService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerControllerTest {
    @Reference
    private ProviderService providerService;
    @Test
    public void test(){
        System.out.println(providerService.sayHello());
    }

}