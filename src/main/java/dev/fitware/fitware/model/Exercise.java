package dev.fitware.fitware.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dev.fitware.fitware.common.enums.TypeExercise;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table (name = "exercises")
@Getter
@Setter
@JsonPropertyOrder({"id", "name", "typeExercise", "description", "userId"}) // ordem de exibição em um get
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "type_exercise")
    private TypeExercise typeExercise;
    private String description;
    @Column(name = "user_id")
    private Long userId;

}
