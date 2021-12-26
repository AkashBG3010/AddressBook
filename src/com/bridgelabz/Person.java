package com.bridgelabz;

import java.util.Scanner;

public class Person {
	
	static Scanner sc = new Scanner(System.in);
	static String firstName,lastName,address,state,email;
	static int pin;
	static long phoneNumber;
	static Contact [] personDetails = new Contact[10];
	
	public static void main(String args[]) {		
		Contact person1 = new Contact("Pavan","Kumar","Balebail","Karnataka",577432,123456789,"pavankaumar@gmail.com");
		Contact person2 = new Contact("Shiva","Kumar","Kushavati","Karnataka",577432,123456789,"shivukumar@gmail.com");
		Contact person3 = new Contact("Sameep","Pai","Bettmakki","Karnataka",577432,123456789,"sameeppai@gmail.com");
		
		personDetails[0]=person1;
		personDetails[1]=person2;
		personDetails[2]=person3;
		
		System.out.println("Created contact list is");
		    for(int i = 0; i < 3;i++) {
		    	System.out.println( personDetails[i] );
		    }
		    operations();
		}
	public static void operations() {
		int j = 0;
	    System.out.println("Enter your choice");
	    System.out.println("1)Add contact");
	    int choice = sc.nextInt();
	    switch(choice) {
	    	case 1:
	    			System.out.println("Enter details of person");
		    		System.out.println("Add first name");
		    		firstName = sc.next();
		    		System.out.println("Add last name");
		    		lastName= sc.next();
		    		System.out.println("Add address");
		    		address = sc.next();
		    		System.out.println("Add state");
		    		state= sc.next();
		    		System.out.println("Add pin");
		    		pin = sc.nextInt();
		    		System.out.println("Add phone number");
		    		phoneNumber = sc.nextLong();
		    		System.out.println("Add email");
		    		email = sc.next();
		    		Contact person4 = new Contact(firstName,lastName,address,state,pin,phoneNumber,email);
		    		personDetails[3]=person4;
		    		j++;
			 for(int i = 0; i < 3 + j;i++) {
				   System.out.println(personDetails[i]);
			 }
		}
	}
}