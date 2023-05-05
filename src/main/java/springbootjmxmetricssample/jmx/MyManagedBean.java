package springbootjmxmetricssample.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "springbootjmxmetricssample:name=MyManagedBean", description = "My Managed Bean")
public class MyManagedBean {

    private static int value1;

    @ManagedAttribute(description = "Value 1")
    public int getValue1() {
        return value1;
    }

    public static void setValue1(int newValue) {
        value1 = newValue;
    }
}