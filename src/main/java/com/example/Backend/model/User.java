package com.example.Backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class User {

	 	@Id
	    @GeneratedValue
	    @Column(name = "id")
	    private long id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "username")
	    private String username;
	    @Column(name = "password")
	    @JsonIgnore
	    private String password;
	    @Column(name = "email")
	    private String email;
	    @Column(name = "tel")
	    private long tel;
	    @Column(name = "gender")
	    private String gender;
	    @Column(name = "specialist")
	    private String specialist;
		
	    public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getTel() {
			return tel;
		}
		public void setTel(long tel) {
			this.tel = tel;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getSpecialist() {
			return specialist;
		}
		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}
}
