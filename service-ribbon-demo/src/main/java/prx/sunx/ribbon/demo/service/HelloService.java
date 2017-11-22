package prx.sunx.ribbon.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunholdIng on 2017/11/22.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    //注解表示断路器（如服务器连接不上时候）配置，失败调用固定的方法，如：hiError
    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-client1/hello?name="+name,String.class);
    }

    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
