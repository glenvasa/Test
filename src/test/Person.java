package test;

public class Person {
	String name;
	int age;
	double weight;
	
	Person(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
//		this.characteristics();
	}
	
	void characteristics() {
		System.out.println("Hello "+name + ". You are "+age +" years old and weigh "+weight + " pounds.");
	}
	
}
