package dev.fitware.fitware.dto;

import dev.fitware.fitware.common.enums.TypeExercise;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gera automaticamente os Getters, Setters e Construtores
@NoArgsConstructor
@AllArgsConstructor

public class ExerciseRequestDTO {

    @NotNull(message = "The name of exercise is mandatory")
    @NotBlank(message = "The name of exercise can`t is void")
    private String name;
    @NotNull(message = "O tipo de exercício é obrigatório")
    @Enumerated(EnumType.STRING)
    private TypeExercise typeExercise;
    private String description;
    private Long userId;

}
