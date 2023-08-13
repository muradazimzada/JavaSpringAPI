package com.example.javalearning;
import java.net.http.HttpResponse;
import java.util.*;

import models.customerAddDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/customers")
public class JavalearningApplication {

    private final CustomerRepository customerRepository;

    public JavalearningApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavalearningApplication.class, args);
    }
    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return  customerRepository.findAll();
    }
    @PostMapping("/add")
    public Object add(@RequestBody customerAddDto dto) {
        Customer customer = new Customer();
        customer.setAge(dto.age());
        customer.setEmail(dto.email());
        customer.setName(dto.name());
        return customerRepository.save(customer);
    }
    @DeleteMapping("delete/{id}")
    public  Object deleteById(@PathVariable("id") Integer id) {
         customerRepository.deleteById(id);
         return "operation successful";
    }

}


