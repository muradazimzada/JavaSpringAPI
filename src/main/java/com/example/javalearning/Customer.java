package com.example.javalearning;

import jakarta.persistence.*;

@Entity
public class Customer
{
    @Id
    @SequenceGenerator(
            name = "c_id_gen",
            sequenceName = "c_id_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "c_id_gen"
    )
    private  Integer id;
    private String name;
    private String email;
    private Integer age;

    public Customer(Integer id, String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    public Customer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
