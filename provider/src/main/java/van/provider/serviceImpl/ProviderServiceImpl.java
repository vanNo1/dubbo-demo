package van.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import provider.ProviderService;
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
