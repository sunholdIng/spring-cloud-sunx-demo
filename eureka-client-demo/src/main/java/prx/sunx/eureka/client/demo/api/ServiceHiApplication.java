package prx.sunx.eureka.client.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 浙江卓锐科技有限公司
 * <p>
 * Created by sunx on 2017/11/21.
 * Description:
 */
@RestController
public class ServiceHiApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello "+name+",i am from port:" +port;
    }
}
