package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalDAO extends JpaRepository<Animal, Integer> {

    Animal findByNume(String nume);
}
