package dev.fitware.fitware.dto;

import dev.fitware.fitware.model.Exercise;

public class ExerciseResponseDTO {

    private String message;
    private String nameExercise;

    public ExerciseResponseDTO(String message, Exercise nameExercise){
        this.message = message;
        this.nameExercise = nameExercise.getName();
    }
}
