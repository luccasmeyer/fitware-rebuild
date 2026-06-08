package dev.fitware.fitware.dto;

import dev.fitware.fitware.model.Exercise;

public class ExerciseResponseDto {

    private String message;
    private String nameExercise;

    public ExerciseResponseDto(String message, Exercise nameExercise){
        this.message = message;
        this.nameExercise = nameExercise.getName();
    }
}
