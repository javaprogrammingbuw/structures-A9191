

import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Num;
		// TODO Auto-generated method stub
		System.out.println("Inter Your Numbers");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if ((a>0 && a<10) && (b>0 && b<10)){
		int a2 = a;
		
		
	int R= a%b;
		
		switch (R) {
		case 0:
		System.out.println("zero");
		break;
		
		case 1:
		System.out.println("One");
		break;
		
		case 2:
		System.out.println("Two");
		break;
		
		case 3:
		System.out.println("Three");
		break;
		
		case 4:
		System.out.println("Four");
		break;
		
		case 5:
		System.out.println("Five");
		break;
		
		 default: 
                System.out.println("no match");
				
	
		}	
		
		}
		else{
			System.out.println("Your  number is not in the range 0 to 10");

	
	}	
			
	}
}
			
			
			
			
			
			
	
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

	


	
