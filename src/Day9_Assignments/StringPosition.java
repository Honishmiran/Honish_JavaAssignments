package Day9_Assignments;

import java.util.Scanner;

public class StringPosition {
	
	 public static void main(final String args[]) {
		 
		 String f;
		 
		 char e, d;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the word in lowercase : ");
		 
		 f = sc.nextLine();
		 
		 System.out.println("Enter the 1st Alphabet in lowercase ");
		 
		 e = sc.next().charAt(0);
		 
		 System.out.println("Enter the 2nd Alphabet in lowercase");
		 
		 d = sc.next().charAt(0);
		 
		 int e_Pos = f.indexOf(e), d_Pos = f.indexOf(d);
		 
		 if(e_Pos > -1){
			 
	            if(d_Pos > -1){
	            	
	                System.out.println("Alphabets present");
	                
	                if(d_Pos > e_Pos)
	                	
	                    System.out.println("First " + e + " then " + d);
	                
	                else
	                	
	                 System.out.println("First " + d + " then " + e);
	                
	            }
	            
	            else {
	            	
	                System.out.print("Only one alphabet present");
	                
	                System.out.println( " - "+e);
	                
	            }
	            
	        }
		 
		 else if(d_Pos > -1){
			 
	            System.out.print("Only one alphabet present");
	            
	            System.out.println( " - "+d);
	            
	        }
		 
		 else{
			 
	            System.out.println("Sorry the alphabets not present in string.");
	            
	        }
		 
	        
	 }
}
