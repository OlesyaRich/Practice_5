package com.example.practice_5.Data;

import java.io.Serializable;

public class AnimalsRepository implements Serializable {
    private String AnimalName;
    private String AnimalType;
    private String AnimalAge;

    public AnimalsRepository() {}
    public AnimalsRepository(String AnimalName) {
        this.AnimalName = AnimalName;
    }
    public AnimalsRepository(String AnimalName, String AnimalType) {
        this.AnimalName = AnimalName;
        this.AnimalType = AnimalType;
    }
    public AnimalsRepository(String AnimalName, String AnimalType, String AnimalAge) {
        this.AnimalName = AnimalName;
        this.AnimalType = AnimalType;
        this.AnimalAge = AnimalAge;
    }

    public void setAnimalName(String animalName) {
        this.AnimalName = animalName;
    }
    public void setAnimalType(String animalType) {
        this.AnimalType = animalType;
    }
    public void setAnimalAge(String animalAge) {
        this.AnimalAge = animalAge;
    }

    public String getAnimalName() {
        return AnimalName;
    }
    public String getAnimalType() {
        return AnimalType;
    }
    public String getAnimalAge() {
        return AnimalAge;
    }



}
