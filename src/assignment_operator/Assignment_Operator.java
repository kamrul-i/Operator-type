package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double length, width, area;
			
			System.out.print("Enter length : ");
			length = input.nextDouble();
			
			System.out.print("Enter width : ");
			width = input.nextDouble();
			
			area = 2 * ( length + width);
			
			System.out.print("Perimeter of Rectangle : "+ area);
		}
        //--------------------------------------------------------
	}

}
