package dev.fitware.fitware.dto;

import dev.fitware.fitware.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private String message;
    private String nameUser;

    public UserResponseDTO(String message, User user){
        this.message = message;
        this.nameUser = user.getName();
    }
}
