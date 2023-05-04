package springbootjmxmetricssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import org.springframework.jmx.support.RegistrationPolicy;

import springbootjmxmetricssample.jmx.HelloWorld;

@SpringBootApplication
public class SpringBootJmxMetricsSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmxMetricsSampleApplication.class, args);
	}
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public MBeanExporter mbeanExporter() {
        AnnotationMBeanExporter exporter = new AnnotationMBeanExporter();
        exporter.setRegistrationPolicy(RegistrationPolicy.IGNORE_EXISTING);
        return exporter;
    }
}
