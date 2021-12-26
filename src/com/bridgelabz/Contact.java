package com.bridgelabz;

public class Contact {
	
	String firstName,lastName,address,state,email;
	int pin;
	long phoneNumber;
	Contact(String firstName,String lastName,String address,String state,int zip,long phoneNumber,String email){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.state=state;
		this.pin=pin;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
				+ state + ", email=" + email + ", pin=" + pin + ", phoneNumber=" + phoneNumber + "]";
	}
}