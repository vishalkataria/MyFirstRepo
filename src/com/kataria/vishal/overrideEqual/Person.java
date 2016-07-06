package com.kataria.vishal.overrideEqual;

public class Person {
	
	String name;
	int age;
	
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this.name == name && this.age == age){
			return true;
		}
		else{
			return false;
		}
	}
}
