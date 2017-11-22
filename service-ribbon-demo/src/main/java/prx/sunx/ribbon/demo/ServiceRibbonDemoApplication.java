package prx.sunx.ribbon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceRibbonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonDemoApplication.class, args);
	}
}
