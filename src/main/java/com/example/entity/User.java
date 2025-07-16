package com.example.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends PanacheEntity {
    public String name;
    public Integer age;

    public User() {}

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}