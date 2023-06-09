package Validation_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User_dto {
	
	private String name;
@Id
	private String email;
	private int pwd;
	private int ph_no;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public int getPh_no() {
		return ph_no;
	}
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
