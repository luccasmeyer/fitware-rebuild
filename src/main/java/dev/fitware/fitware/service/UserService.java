package dev.fitware.fitware.service;

import dev.fitware.fitware.model.User;
import dev.fitware.fitware.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User registerUser(User user){

        String passwordUser =
                Base64.getEncoder().encodeToString(user.getPassword().getBytes());

        user.setPassword(passwordUser);

        return repository.save(user);
    }

    public User getProfile(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado: " + id));
    }

    public void deleteExercise(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Usuario não encontrado com o ID: " + id);
        }
    }
}
