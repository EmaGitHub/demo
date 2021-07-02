package it.plansoft.skills.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

import javax.persistence.*;

import it.plansoft.skills.Model.BaseModel;

@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseModel<Long>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "first_name", nullable = true)
	private String firstName;
	@Column(name = "last_name", nullable = true)
	private String lastName;
	@Column(name = "dt_insert", nullable = true)
	private java.util.Date  dtInsert;
	@Column(name = "is_system_admin", nullable = true)
	private Boolean isSystemAdmin;

	public String getUsername() {
		return username;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.util.Date getDtInsert() {
		return dtInsert;
	}

	public void setDtInsert(java.util.Date date) {
		this.dtInsert = date;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getIsSystemAdmin() {
		return isSystemAdmin;
	}

	public void setIsSystemAdmin(Boolean isSystemAdmin) {
		this.isSystemAdmin = isSystemAdmin;
	}

}