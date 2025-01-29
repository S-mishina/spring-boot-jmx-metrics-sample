package springbootjmxmetricssample.controller;

import static springbootjmxmetricssample.util.Util.generateRandomValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootjmxmetricssample.jmx.MyManagedBean;

@RestController
public class SampleController {
    @GetMapping("/")
    public String index() {
        int newValue = generateRandomValue();
        System.out.println("newValue: " + newValue);
        MyManagedBean.setValue1(newValue);
        return "Hello World!";
    }
}
