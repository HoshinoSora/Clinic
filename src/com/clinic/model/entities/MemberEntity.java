package com.clinic.model.entities;

import java.util.Date;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> parent of ffc046f... login

public class MemberEntity {
	private int memberId;
	private String memberName;
	private String memberIdCard;
	private Role role;
	private String memberGender;
	private Date dateOfBirth;
	private String memberAddress;
	private String memberPhone;
	private String memberEmail;
	private String memberPassword;
>>>>>>> parent of ffc046f... login

<<<<<<< HEAD
public class MemberEntity {
	private int id;
	private String name;
	private String identityCard;
	private String role;
	private String gender;
	private Date dateOfBirth;
	private String address;
	private String phoneNumber;
	private String email;
	private String password;

	public int getId() {
<<<<<<< HEAD
		return id;
	}

	public void setId(int id) {
		this.id = id;
=======
=======
	public enum Role {
		Admin, Doctor, Receptionist
	}

	public int getId() {
>>>>>>> parent of ffc046f... login
		return memberId;
	}

	public void setId(int id) {
		this.memberId = id;
>>>>>>> parent of ffc046f... login
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
