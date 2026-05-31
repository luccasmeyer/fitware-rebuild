package dev.fitware.fitware.model;

import jakarta.persistence.Entity;
import lombok.Getter;

import java.util.List;

@Entity
public class Sheet {

    private String name;
    @Getter
    private String typeSheet;
    private String descriptio;
    private List<Exercise> listExercise;

    public List<Exercise> getList(){
        return this.listExercise;
    }
}
