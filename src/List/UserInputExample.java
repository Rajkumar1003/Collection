package List;

import java.util.Scanner;

public class UserInputExample {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int inputNumber = sc.nextInt();
		sc.close();
		System.out.println("Input value is - "+inputNumber);
		
	}

}
