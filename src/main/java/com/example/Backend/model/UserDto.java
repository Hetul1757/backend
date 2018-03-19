package com.example.Backend.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDto {

		private long id;
		private String name;
		private String username;
		private String password;
		private String email;
		private long tel;
		private String gender;
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