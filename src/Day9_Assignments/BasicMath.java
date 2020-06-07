package Day9_Assignments;

import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		int i, j, scn, add, sub, mul;
		
		double div;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		i = sc.nextInt();
		
		System.out.println("Enter second Number");
		
		j = sc.nextInt();
		
		while(true) 
		{
			
		System.out.println("Enter '1' for addition");	
		
		System.out.println("Enter '2' for Subraction");	
		
		System.out.println("Enter '3' for multiplication");	
		
		System.out.println("Enter '4' for division");
		
		System.out.println("Enter '5' to EXIT");
		
		scn = sc.nextInt();
		
		switch(scn)
		{
		
		case 1:
			
			add = i+j;
			
			System.out.println("Addition of two numbers " +add);
			
			break;
		
		case 2:
			
			sub = i-j;
			
			System.out.println("Subraction of two numbers " +sub);
			
			break;
			
		case 3:
			
			mul = i*j;
			
			System.out.println("Multiplication of two numbers" +mul);
			
			break;
			
		case 4:
			
			div = i/j;
			
			System.out.println("Division of two numbers" +div);
			
			break;
			
		case 5:
			
			System.exit(0);
		}
	
		}

	}

}
