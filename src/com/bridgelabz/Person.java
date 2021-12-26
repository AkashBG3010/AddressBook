package com.bridgelabz;

public class Person {

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
		    	if(personDetails[i] != null) {
		    		 System.out.println( personDetails[i] );
		    	}
		    }
		}
}