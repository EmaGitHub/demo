package it.plansoft.skills.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import it.plansoft.skills.DTO.UserDTO;

@Service
public class UserRolesService extends BaseCrudService<JpaRepository<UserDTO, Long>, UserDTO, Long> {

	public UserRolesService(JpaRepository<UserDTO, Long> repo) {
		super(repo);
	}
}