package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double length, area;
			
			System.out.print("Enter length : ");
			length = input.nextDouble();
			
			area = length * length;
			
			System.out.printf("Area of Square : %.2f ", area);
		}
        //--------------------------------------------------------
	}

}
