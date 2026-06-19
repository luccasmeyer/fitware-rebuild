package dev.fitware.fitware.mapper;

import dev.fitware.fitware.dto.ExerciseRequestDTO;
import dev.fitware.fitware.model.Exercise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

    Exercise toModel(ExerciseRequestDTO dto);

}
