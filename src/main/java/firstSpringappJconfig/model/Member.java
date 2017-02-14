package firstSpringappJconfig.model;

import java.util.Date;

public class Member {
	
	private String name;
	private String surname;
	private String email;
	private String password;
	private Date registered;
	
	public Member(String name, String surname, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.registered = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public Date getRegistered() {
		return registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password
				+ ", registered=" + registered + "]";
	}
	
	
	
	

}
