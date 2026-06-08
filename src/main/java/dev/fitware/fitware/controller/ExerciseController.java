package dev.fitware.fitware.controller;

import dev.fitware.fitware.dto.ExerciseResponseDto;
import dev.fitware.fitware.dto.UserResponseDto;
import dev.fitware.fitware.model.Exercise;
import dev.fitware.fitware.service.ExerciseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    private final ExerciseService service;

    public ExerciseController(ExerciseService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ExerciseResponseDto> registerExercise(@Valid @RequestBody Exercise exercise){

        Exercise exerciseBody = service.registerExercise(exercise);

        ExerciseResponseDto response =
                new ExerciseResponseDto("Exercício criado com sucesso", exerciseBody);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<Exercise> listExercise(){
        return service.listExercise();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExercise(@PathVariable Long id){
        service.deleteExercise(id);

        return ResponseEntity.ok("Exercício deletado com sucesso!");
    }
}