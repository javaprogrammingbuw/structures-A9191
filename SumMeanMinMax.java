

import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max = 0;
		int Min = 0;
		int Sum = 0;
		double Mean = 0;

		System.out.println("Inter Your Numbers");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		// Max Calculation-------------------------------------------------------

		if (a>b && a>c){
			Max = a;
		}
		else if (b>a){ //What about c?
			Max = b;
		}
		else if (c>b){
			Max = c;
		}
		
		// Min Calculation--------------------------------------------------------
		if (a<b && a<c){
			Min = a;
		}
		else if (b<a){ //What about c?
			Min = b;
		}
		else if (c<b){
			Min = c;
		}
		
		//Sum-----------------------------------------------------------------------
		Sum = a+b+c;
		
		//mean----------------------------------------------------------------------
		Mean = (a+b+c)/3;	
		
		
		
		System.out.println("Mean is : " + Mean +"    "+"Sum is : " + Sum+"   "+"Max is : " + Max+"   "+"Min is : " + Min);
		
			
			
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
	}

}
