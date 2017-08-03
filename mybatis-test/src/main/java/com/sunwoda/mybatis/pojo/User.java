package com.sunwoda.mybatis.pojo;

public class User {
	private int id;
	private String userName;
	private Integer age;
	private String address;
	public User() {
		super();
	}
	public User(int id, String userName, Integer age, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + ", address=" + address + "]";
	}

}
