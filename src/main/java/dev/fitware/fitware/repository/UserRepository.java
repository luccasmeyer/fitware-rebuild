package dev.fitware.fitware.repository;

import dev.fitware.fitware.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
