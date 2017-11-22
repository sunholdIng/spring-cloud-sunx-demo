package prx.sunx.ribbon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@SpringBootApplication
//断路器注解配置
@EnableHystrix
public class ServiceRibbonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonDemoApplication.class, args);
	}
}
