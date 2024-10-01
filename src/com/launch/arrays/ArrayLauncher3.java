package com.launch.arrays;

//UNDERSTANDING TO STRING METHOD


class EmailId{
	String name;
	String email;
	EmailId(String name, String email){
		this.name = name;
		this.email = email;
	}
}

class EmailId1 extends EmailId{
	
	EmailId1(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmailId1 [name=" + name + ", email=" + email + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}		
}

public class ArrayLauncher3 {

	public static void main(String[] args) {
	
		EmailId emaiId1 = new EmailId("GK", "GK9595@gmail.com");
		EmailId1 emaiId2 = new EmailId1("GK", "GK1@umbc.edu");

		System.out.println(emaiId1.toString());
		System.out.println(emaiId1);
		System.out.println(emaiId2.toString());
	}

}

/*
 * From the below output we can conclude that "println" will call the toString method of Object class which inturn will return the
 * 		address of the object
 *  
 * When we override toSting method, it will return the field names and it's values.
 * 
 * 
 */
