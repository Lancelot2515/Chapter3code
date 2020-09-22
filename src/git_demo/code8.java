package git_demo;

import java.util.Scanner;

public class code8 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds+"seconds is "+minutes+" minutes and " +remainingSeconds + " seconds");
		

	}
}
