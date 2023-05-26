package com.app.core;

public class Cricket {

	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public Cricket(String name) {
		super();
		this.name = name;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricket [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone + ", rating="
				+ rating + "]";
	}

	public Cricket(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Cricket) {
			return (this.name).equals(((Cricket)o).name);
		}
		return false;
	}
	
	
}
