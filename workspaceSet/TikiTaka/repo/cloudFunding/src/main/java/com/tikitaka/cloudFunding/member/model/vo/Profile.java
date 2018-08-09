package com.tikitaka.cloudFunding.member.model.vo;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class Profile {
	

	String email;
	String location;
	String shortDescription;
	String homepage;
	String phone1;
	String phone2;
	String phone3;
	
	
	public Profile() {
		
	}

	

	public Profile(String email, String location, String shortDescription, String homepage, String phone1,
			String phone2, String phone3) {
		super();
		this.email = email;
		this.location = location;
		this.shortDescription = shortDescription;
		this.homepage = homepage;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getHomepage() {
		return homepage;
	}


	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}


	public String getPhone1() {
		return phone1;
	}


	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}


	public String getPhone2() {
		return phone2;
	}


	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getPhone3() {
		return phone3;
	}


	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}


	@Override
	public String toString() {
		return "Profile [email=" + email + ", location=" + location + ", shortDescription=" + shortDescription
				+ ", homepage=" + homepage + ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3 + "]";
	}
	
	
}
