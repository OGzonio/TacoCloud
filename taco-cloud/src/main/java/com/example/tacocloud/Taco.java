package com.example.tacocloud;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=5, message = "Nazwa musi wynosić conajmniej 5 znaków")
    private String name;
    @Size(min=1, message = "Musisz wybrać conajmniej 1 składnik")
    private List<String> ingredients;

}
