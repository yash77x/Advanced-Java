package com.xworkz.map.runner;

public class Var {

	String name = "Yash";
	 int age;
	String course;
	float cgpa;
	char grade;
	{
		course = "java";
	}
	
	public Var() {
		
	}
	
	public Var(String name) {
		this.name = name;
	}
	
	public Var(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	

	@Override
	public String toString() {
		return "Var [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Var var = new Var("Suhas");
		System.out.println(var.name);
		
		var.setName("Yash");
		System.out.println(var.getName());
		
		System.out.println(var.course);
		System.out.println(var.cgpa);
		System.out.println(var.grade);

		Var var1 = new Var("Yash", 23);
		System.out.println(var1);
		
		
		System.out.println(var.add(1, 2, 3));
	}
}
