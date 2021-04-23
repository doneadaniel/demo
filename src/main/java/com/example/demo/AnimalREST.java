package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animale")
public class AnimalREST {

    @Autowired
    private AnimalDAO animalDAO;

    @GetMapping
    public String getAimal(){
        return "Sunt un animal";
    }

    @GetMapping(path = "/{id}")
    public Animal getAimalDupaId(@PathVariable Integer id){
        Animal animalDinBazaDeDate = animalDAO.findById(id).get();

        return animalDinBazaDeDate;

//        Animal animal = new Animal();
//        animal.setId(4);
//        animal.setNume("X");
//        animalDAO.save(animal);
//        return animal;
    }


    @GetMapping(path = "/name/{name}")
    public Animal getAimalDupaNume(@PathVariable String name){
        Animal animalDinBazaDeDate = animalDAO.findByNume(name);

        return animalDinBazaDeDate;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void salveazaAnimal(@RequestBody Animal a) {
        animalDAO.save(a);
    }

}
