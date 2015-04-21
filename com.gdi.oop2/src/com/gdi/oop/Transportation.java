package com.gdi.oop;

public class Transportation {

	public static void main(String[] args) {
		// vars must be declared 'type name;' before they can be used
		// they can be instantiated in the same line or later
		// until they've been instantiated they are null
		int numberPassengers;
		numberPassengers = 1;
		// or
		int maxNumberPassengers = 5;
		boolean isFull;
		boolean hasSpace;
		boolean isNotFull;
		
		isFull = (numberPassengers == maxNumberPassengers);
		hasSpace = (numberPassengers < maxNumberPassengers);
		isNotFull = !isFull;
		// '!' is the negative operator		
		
		numberPassengers++;
		// ++ increments var by 1

		System.out.println("Number of Passengers: " + numberPassengers);
		System.out.println("The car is full: " + isFull);
		System.out.println("The car has space left: " + hasSpace);
		System.out.println("The car is not yet full: " + isNotFull);
			
		//Arithmetic Operators
		int currentSpeed = 0;
		System.out.println("Initial Speed: " + currentSpeed);
		currentSpeed = currentSpeed + 20;
		System.out.println("Faster! New Speed: " + currentSpeed);
		currentSpeed = currentSpeed / 2;
		System.out.println("Slow down! New Speed: " + currentSpeed);
		currentSpeed = currentSpeed * 3;
		System.out.println("Speed Demon! New Speed: " + currentSpeed);
	
		//CONDITIONALS
		boolean dangerToSelfOnly = (numberPassengers == 1)&& (currentSpeed < 55);
		System.out.println("Am I a danger to myself only? " + dangerToSelfOnly);
	
	}

}
