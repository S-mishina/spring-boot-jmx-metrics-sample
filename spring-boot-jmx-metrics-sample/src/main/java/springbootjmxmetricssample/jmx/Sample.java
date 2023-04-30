package springbootjmxmetricssample.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "springbootjmxmetricssample.jmx:name=Sample")
public class Sample {
    private int value = 1;
    @ManagedAttribute
    public int getValue() {
        System.out.println("Getting value: " + value);
        return value;
    }

    @ManagedAttribute
    public void setValue(int value) {
        System.out.println("Getting value: " + value);
        this.value = value;
    }
}
