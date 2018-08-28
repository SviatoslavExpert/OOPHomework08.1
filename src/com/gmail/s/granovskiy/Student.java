package com.gmail.s.granovskiy;

import java.io.Serializable;

public class Student implements Serializable{
	/*  fields  */
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private char sex;

    /*  constructors  */
	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Student() {
		super();
	}

	/*  getters and setters  */
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*  toString  */
	@Override
	public String toString(){
		return (" Name: " + name + "," + " Age: " + age + "," + " Sex: "+ String.valueOf(sex));
	}
    
}
