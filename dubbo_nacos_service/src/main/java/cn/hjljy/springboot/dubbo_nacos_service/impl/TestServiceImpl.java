package cn.hjljy.springboot.dubbo_nacos_service.impl;

import cn.hjljy.springboot.dubbo_nacos_api.ITestServiceApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author yichaofan
 * @date 2020/1/7 14:25
 * @apiNote //TODO
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements ITestServiceApi {
    @Override
    public String getName(String name) {
        return "name: "+name;
    }
}
