package com.gmail.s.granovskiy;

import java.io.*;
import java.io.PrintWriter;

public class Group implements Serializable {
	private Student [] group;
	private static final long serialVersionUID = 1L;
	Group(){
		group = new Student[0];
	}
	/*  adding a student to the group  */
	public void addStudent(String name, int age, char sex){
		Student[] c= new Student[group.length+1];
		System.arraycopy(group, 0,c , 0, group.length);
		c[c.length-1]=new Student(name,age,sex);
		group = c;
	}
	/*  creating the file c.csv and printing group to the file c.csv */
	public void printgroup(){
		try (PrintWriter pw = new PrintWriter("c.csv")) {
			for(Student k:group){
			    System.out.println(k);
			    pw.println(k);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}
}
