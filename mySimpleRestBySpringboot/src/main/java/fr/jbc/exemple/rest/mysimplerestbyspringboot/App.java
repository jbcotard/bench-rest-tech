package fr.jbc.exemple.rest.mysimplerestbyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jbcotard on 17/06/2017.
 */

@RestController
@EnableAutoConfiguration
public class App {

    public static int counter = 0;

    @RequestMapping("/")
    public String home() {
        return "{counter: " + ++counter + ", thread: " + Thread.currentThread().getName() + "}";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
