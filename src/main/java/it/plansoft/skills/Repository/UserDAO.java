package it.plansoft.skills.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.plansoft.skills.DTO.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, Long> {
	UserDTO findByUsername(String username);
}