package com.example.CRUD.models;
import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    public void setId(Long id) {
        this.id = id;
    }
    @javax.persistence.Id
    public Long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}