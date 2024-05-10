package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double length, area;
			
			System.out.print("Enter length : ");
			length = input.nextDouble();
			
			area = 4 * length;
			
			System.out.print("Perimeter of Square : "+ area);
		}
        //--------------------------------------------------------
	}

}
