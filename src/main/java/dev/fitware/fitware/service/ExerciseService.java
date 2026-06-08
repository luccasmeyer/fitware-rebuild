package dev.fitware.fitware.service;

import dev.fitware.fitware.model.Exercise;
import dev.fitware.fitware.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    private final ExerciseRepository repository;

    public ExerciseService(ExerciseRepository repository){
        this.repository = repository;
    }

    public Exercise registerExercise(Exercise exercise){

        return repository.save(exercise);
    }

    public List<Exercise> listExercise(){
        return repository.findAll();
    }

    public void deleteExercise(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Exercício não encontrado com o ID: "+ id);
        }
    }
}