package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

    public Animal(Integer id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Animal() {
    }

    @Id
    private Integer id;

    @Column(name = "nume")
    private String nume;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
