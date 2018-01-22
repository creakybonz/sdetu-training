package oop;

class Person {
	//attributes
	String name;
	String email;
	String phone;
	
	//methods needed walk eat sleep
	
	void walk() {
		System.out.println(name + " is waling.");
	}
	
	void email() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instantiating object
		
		Person person1 = new Person();
		//define properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "121-555-1212";
		
		person1.walk();
		person1.email();
		person1.sleep();
		/*
		//person
		
		//Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "121-555-1212";
		
		//Action, activity, behavior
		walking(name);
		System.out.println(name + " is eating");
		
		
		//what if we want another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "121-555-1212";
		
		//Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
		
	}
	
	//enhance by adding functions to minimize code
	
	static void walking(String name) {
		System.out.println(name + " is walking."); */
	}

}


