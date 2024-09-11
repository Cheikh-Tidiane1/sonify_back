package fr.tid.sonify.repository;

import fr.tid.sonify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
