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
			
			result = num1 + num2;
			System.out.println("sum = "+result);
			
			result = num1 - num2;
			System.out.println("sub : "+result);
			
			result = num1 * num2;
			System.out.println("multiplication : "+result);
			
			result = num1 / num2;
			System.out.println("Division : "+result);
			
			
			result = num1 % num2;
			System.out.print("Reminder : "+result);
		}
	}

}
