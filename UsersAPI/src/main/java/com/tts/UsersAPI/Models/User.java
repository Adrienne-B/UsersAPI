package com.tts.UsersAPI.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "firstName")
	private String firstName;

	//@Column(name = "lastName")
	private String lastName;

	
	private String state;
	
	
	//Constructor - Constructs/makes an entity.
//	public User(Long id, String firstName, String lastName, String state) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.state = state;	
//	}

	//Getters..we do not use setters because we do not want the user to update any info.
	public Long getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getState() {
		return state;
	}	
	
	
}

