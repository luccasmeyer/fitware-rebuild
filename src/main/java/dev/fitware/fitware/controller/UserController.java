package dev.fitware.fitware.controller;

import dev.fitware.fitware.model.User;
import dev.fitware.fitware.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public User registerUser(@RequestBody User user){
        return service.registerUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getProfile(@PathVariable Long id) {
        User profileUser = service.getProfile(id);
        return ResponseEntity.ok(profileUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExercise(@PathVariable Long id){
        service.deleteExercise(id);

        return ResponseEntity.ok("Usuario deletado com sucesso");
    }
}
