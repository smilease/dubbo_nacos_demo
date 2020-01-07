package cn.hjljy.springboot.dubbo_nacos_api;

/**
 * @author hjljy@outlook.com
 * @date 2020/1/7 14:22
 * @apiNote //nacos test
 */
public interface ITestServiceApi {
    /**
     * @param name 参数
     * @return java.lang.String
     * @author hjljy@outlook.com
     * @date 2020/1/7
     */
    String getName(String name);
}
