package first_project;

import java.util.Scanner;
public class LearningJava {
	
	Scanner scn;
	int Input;
	LearningJava(){
		scn = new Scanner(System.in);
		Input=0;
	
	}
	void CheckdivisibleBy7() {
		if(Input == 0)
			System.out.println("It is not divisble by 7");

	else
			System.out.println("It is not divisble by 7");
		
	}
	
	void getNumFromUser() {
		System.out.println("Please enter the number");
		Input = scn.nextInt();
		}
	
	
	public static void main(String[] args) {
		LearningJava lj = new LearningJava();
		lj.getNumFromUser();
		lj.CheckdivisibleBy7();
		
		}

}
