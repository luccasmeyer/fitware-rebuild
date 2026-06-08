package dev.fitware.fitware.controller;

import dev.fitware.fitware.model.Exercise;
import dev.fitware.fitware.service.ExerciseService;
import jakarta.validation.Valid;
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
    public Exercise registerExercise(@Valid @RequestBody Exercise exercise){

        return service.registerExercise(exercise);
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