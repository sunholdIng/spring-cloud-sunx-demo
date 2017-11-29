package prx.sunx.eureka.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul注解，路由网关
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class ServiceZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulDemoApplication.class, args);
	}
}
