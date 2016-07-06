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
		if(obj == this){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		
		Person p = (Person) obj;
		
		if(this.name == p.name && this.age == p.age){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		int hash = name.length() + age;
		return hash;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (name + " , " + age);
	}
}
