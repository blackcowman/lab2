package com.example.lab2;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;

	
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public int getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int no, String name, int age) {
		setAge(age);
		setName(name);
		setNo(no);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no="+this.no+", name=" + this.name + ", age="+this.age + "]";
	}
	
} 
