package com.example.javalearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavalearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavalearningApplication.class, args);
    }
    @GetMapping(value = "/")
    public  String great() { return  "Hello";}
    @GetMapping(value = "/get")
    public Object get() {
        return new Object();  // new Response("Hello",  new Person("Murad"), java.util.List.of("sss"));
    }

    static record Person(String name) {
    }
}
  //record Response
  // (String great, Person person, java.util.List<String> list) {
 //  }


