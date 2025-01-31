package springbootjmxmetricssample.controller;

import springbootjmxmetricssample.util.Util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootjmxmetricssample.jmx.MyManagedBean;

@RestController
public class SampleController {
    @GetMapping("/")
    public String index() {
        int newValue = Util.generateRandomValue();
        System.out.println("newValue: " + newValue);
        MyManagedBean.setValue1(newValue);
        String url = System.getenv("TEST_ENDPOINT");
        if (url != null) {
            Util.httpRequest(url);
        }
        return "{\"message\": \"Hello World!\"}";
    }
}
