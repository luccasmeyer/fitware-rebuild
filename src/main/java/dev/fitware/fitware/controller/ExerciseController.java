package dev.fitware.fitware.controller;

import dev.fitware.fitware.dto.ExerciseResponseDTO;
import dev.fitware.fitware.dto.ExerciseRequestDTO;
import dev.fitware.fitware.mapper.ExerciseMapper;
import dev.fitware.fitware.model.Exercise;
import dev.fitware.fitware.service.ExerciseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
@RequiredArgsConstructor
public class ExerciseController {

    private final ExerciseService service;
    private final ExerciseMapper exerciseMapper;

    @PostMapping
    public ResponseEntity<ExerciseResponseDTO> registerExercise(@Valid @RequestBody ExerciseRequestDTO request){

        Exercise exerciseModel = exerciseMapper.toModel(request);
        Exercise exerciseBody = service.registerExercise(exerciseModel);

        ExerciseResponseDTO response =
                new ExerciseResponseDTO("Exercício criado com sucesso", exerciseBody);

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