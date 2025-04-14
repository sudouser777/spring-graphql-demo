package org.example.spring.graphql.demo.controller;

import org.example.spring.graphql.demo.model.Pet;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PetsController {

    @QueryMapping
    public List<Pet> pets() {
        return List.of(
                new Pet("cat", "black"),
                new Pet("dog", "white")
        );
    }
}
