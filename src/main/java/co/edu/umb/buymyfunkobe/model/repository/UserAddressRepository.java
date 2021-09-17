package co.edu.umb.buymyfunkobe.model.repository;

import co.edu.umb.buymyfunkobe.model.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
}