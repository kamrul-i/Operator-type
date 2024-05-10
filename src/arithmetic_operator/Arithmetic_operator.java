package arithmetic_operator;

import java.util.Scanner;

public class Arithmetic_operator {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int num1, num2, result;
			
			System.out.print("Enter first number : ");
			num1 = input.nextInt();
			
			System.out.print("Enter second number : ");
			num2 = input.nextInt();
			
			
			double result1 = (double) num1 / num2;
			System.out.printf("Division : %.2f", result1);
			System.out.printf("\n");
			
		}
	}

}
