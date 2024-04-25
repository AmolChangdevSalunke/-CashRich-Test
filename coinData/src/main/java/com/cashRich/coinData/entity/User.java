package com.cashRich.coinData.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull(message = "Please enter first name")
	private String firstName;
	@NotNull(message = "Please enter last name")
	private String lastName;
	@NotNull(message = "Please Enter email ID ")
	@Column(unique = true)
	@Email(message = "Enter valid email ID")
	private String email;
	@NotNull
	@Size(max = 10, min = 10, message = "Please enter valid Mobile Number")
	private Long mobile;
	@Column(unique = true)
	@NotNull(message = "Please Enter user name")
	@Size(max = 4, min = 15, message = "User name shuld be in between 4 to 15 character")
	private String username;
	@NotNull(message = "Please Enter password")
	@Length(min = 8, max = 15, message = "Password must be between 8 and 15 characters long")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Password must contain at least one digit, one lower case, one upper case, and one special character")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
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

}
