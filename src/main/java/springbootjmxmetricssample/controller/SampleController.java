package springbootjmxmetricssample.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootjmxmetricssample.jmx.MyManagedBean;
@RestController
public class SampleController {
    @GetMapping("/")
    public String index() {
            Random rand = new Random();
            int newValue = rand.nextInt(100); // 0 から 99 の範囲のランダム値を生成
            System.out.println("newValue: " + newValue);
            MyManagedBean.setValue1(newValue);
        return "Hello World!";
    }
}