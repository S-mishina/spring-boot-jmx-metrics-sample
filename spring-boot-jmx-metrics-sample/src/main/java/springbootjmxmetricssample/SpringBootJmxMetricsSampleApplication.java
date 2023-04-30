package springbootjmxmetricssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "springbootjmxmetricssample.jmx")
public class SpringBootJmxMetricsSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmxMetricsSampleApplication.class, args);
	}

}
