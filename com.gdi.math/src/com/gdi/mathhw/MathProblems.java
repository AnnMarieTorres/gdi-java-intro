package com.gdi.mathhw;

public class MathProblems {

	public static void main(String[] args) {
		
		// We are going to build a little program that will 
		// take values for x and y and tell you all sorts of facts about them.
		
		
		// First you will have to initialize a value for x.
		// You can change this number up to test your program.
		int x = 2;
		int y = 2;
		System.out.println("x : " + x );
		System.out.println("y : " + y );
		
		
		// ARE X AND Y EVEN NUMBERS?
		boolean xIsEven;
		xIsEven = x%2 == 0; 
		System.out.println("Is x an even number? : " + xIsEven );
		
		boolean yIsEven = y%2 == 0; 
		System.out.println("Is y an even number? : " + yIsEven );
		
		
		// ARE THEY DIVISIBLE BY 3?
		boolean xIsDivThree = x%3 == 0;
		boolean yIsDivThree = y%3 == 0;
		System.out.println("Is x divisible by 3? : " + xIsDivThree);
		System.out.println("Is y divisible by 3? : " + yIsDivThree);
		
		
		// WHAT IS X^3? (x cubed)
		int xCubed = x*x*x;
		int yCubed = y*y*y;
		System.out.println("x^3 : " + xCubed);
		System.out.println("y^3 : " + yCubed);
		
		
		// ARE X AND Y POSITIVE NUMBERS?
		boolean xIsPos = x > 0;
		boolean yIsPos = y > 0;
		System.out.println("Is x a positive number? : " + xIsPos);
		System.out.println("Is y a positive number? : " + yIsPos);
		
		
		// IF X AND Y WERE THE LENGTHS OF THE SHORT SIDES OF A RIGHT TRIANGLE,
		// WHAT WOULD BE THE VALUE OF THE HYPTOENUSE OF THAT RIGHT TRIANGLE?
		double hypotenuse = Math.sqrt(x*x + y*y);
		System.out.println("The hypotenuse of x and y's triangle is : " + hypotenuse);
		
		
		// IF YOU BOUGHT X NUBMER OF ORANGES FOR $.65 EACH
		// AND Y NUMBER OF APPLES FOR $.55 EACH
		// WHAT IS YOUR TOTAL BILL?
		double orangePrice = 0.65;
		double applePrice = 0.55;
		double totalBill = (x*orangePrice) + (y*applePrice);
		System.out.println("My apples and oranges bill is : $" + totalBill);
		
		// Why is my double $2.4000000000000004? http://floating-point-gui.de/basic/
		// Solution: truncate the totalBill to two decimal places
		System.out.printf("My apples and oranges bill is : $%.2f" + "\r", totalBill);
		
		//Or use BigDecimal
		
		// WHICH NUMBER, X OR Y, IS LARGER?
		
		//Conditional with 'if' statements
			if (x > y) {
				System.out.println("X is the larger number");
			} else if (y > x) {
				System.out.println("Y is the larger number");
			} else {
				System.out.println("X and Y are equal");
			}
			
		//Without 'if' statements
			boolean xIsGreater = x > y;
			boolean yIsGreater = y > x;
			boolean xAndYEqual = x == y;
			
			System.out.println("X is the larger number : " + xIsGreater);
			System.out.println("Y is the larger number : " + yIsGreater);
			System.out.println("X and Y are equal : " + xAndYEqual);
		
		// WHICH NUMBER, X/Y or Y/X, IS LARGER?
			if (x/y > y/x){
				System.out.println("x/y is the larger number");
			}else if (y/x > x/y){
				System.out.println("y/x is the larger number");
			}else 
				System.out.println("x/y and y/x are equal");
	}
}
