package structures;

import java.util.Scanner;

//loops
 
public class EvenOdd {
	
	public static void main(String[] args) {
		int numTarget=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Inter Your numTargetber");
		numTarget = scan.nextInt();
		
/*   do{
			System.out.println("Your numTargetber is Even");
			System.out.println(numTarget%2);
			
			
		}while (numTarget % 2 == 0);
		
		do{
			System.out.println("Your numTargetber is Odd");

		}while (numTarget<100);
		
	*/
		
		int current = 1;
		do {
			if( current % 2 != 0 ) {
				System.out.print( current + " " );
			}
			++current;
		   } while( current <= numTarget );
		
		
		
		/*		for(int i=0;i<=numTarget;i++){
			
			if(i%2!=0){
				
				System.out.print(i + " ");
			
	
	
		
		//todo: The program takes a numTargetber as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
				
	
	
                                     }
                                     			
*/	
	                                     }
	           }
