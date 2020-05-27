package com.mvc;

public class Employee {

	//POJO OR BEAN OR MODEL 
	
	int id;
	String Name;
	
	public Employee()
	{
		System.out.println("--employee Object Constructed--");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + "]"+super.toString();
	}
	
}
