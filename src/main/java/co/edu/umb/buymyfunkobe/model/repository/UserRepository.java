package co.edu.umb.buymyfunkobe.model.repository;

import co.edu.umb.buymyfunkobe.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
}