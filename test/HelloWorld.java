import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class HelloWorld implements HelloWorldMBean {

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

    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("test:type=HelloWorld");
        HelloWorld mbean = new HelloWorld();
        mbs.registerMBean(mbean, name);
        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}