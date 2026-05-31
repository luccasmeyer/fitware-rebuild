package dev.fitware.fitware.model;

import jakarta.persistence.Entity;
import lombok.Getter;

public class Exercise {

    private String name;
    @Getter
    private String typeExercises;
    private String description;

    public Exercise getExercise(){
        return this;
    }
}
