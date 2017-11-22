package prx.sunx.ribbon.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prx.sunx.ribbon.demo.service.HelloService;

/**
 * Created by sunholdIng on 2017/11/22.
 */
@RestController
@RequestMapping("/ribbon")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
