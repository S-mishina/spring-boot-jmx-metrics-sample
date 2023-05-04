package springbootjmxmetricssample.jmx;

import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "springbootjmxmetricssample:name=HelloWorld")
public class HelloWorld {
    private String greeting = null;

    public HelloWorld() {
        this.greeting = "Hello World! I am a Standard MBean";
    }

    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void printGreeting() {
        System.out.println(greeting);
    }
}
