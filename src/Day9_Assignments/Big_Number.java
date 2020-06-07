package Day9_Assignments;

import java.util.Scanner;

public class Big_Number {
	
	public static void main(String[]args) {
		
		int x,y,z;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type first number :");
		
		x = sc.nextInt();
		
		System.out.println("Type second number :");
		
		y = sc.nextInt();
		
		System.out.println("Type third number :");
		
		z = sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("The big number is - 23" +x );
		}

		else if(y>z)
		{
			System.out.println("The big number is - " +y );
		}
		
		else 
		{
			System.out.println("The big number is  " +z );
		}
		sc.close();
	}

}
