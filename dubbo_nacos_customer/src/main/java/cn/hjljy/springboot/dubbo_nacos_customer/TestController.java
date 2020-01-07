package cn.hjljy.springboot.dubbo_nacos_customer;

import cn.hjljy.springboot.dubbo_nacos_api.ITestServiceApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yichaofan
 * @date 2020/1/7 18:14
 * @apiNote //TODO
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    ITestServiceApi serviceApi;

    @GetMapping("TEST")
    public String getName(String name) {
        return serviceApi.getName(name);
    }
}
