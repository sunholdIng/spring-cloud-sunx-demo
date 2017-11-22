package prx.sunx.eureka.client.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prx.sunx.eureka.client.demo.service.SchedualServiceHi;

/**
 * 浙江卓锐科技有限公司
 * <p>
 * Created by sunx on 2017/11/21.
 * Description:
 */
@RestController
@RequestMapping("/feign")
public class ServiceHiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
