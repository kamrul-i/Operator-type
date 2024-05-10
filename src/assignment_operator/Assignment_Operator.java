package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double base, height, area;
			
			System.out.print("Enter base : ");
			base = input.nextDouble();
			
			System.out.print("Enter height : ");
			height = input.nextDouble();
			
			area = 0.5 * base * height;
			
			System.out.println("Area of triangle : "+area);
		}
        //--------------------------------------------------------
		//assignment operator চিহ্ন ( =, +=, -=, *=, /=, %= ) ৬টি।।
	}

}
