package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double side, area;
			
			System.out.print("Enter side : ");
			side = input.nextDouble();
			
			System.out.print("Enter side : ");
			side = input.nextDouble();
			
			System.out.print("Enter side : ");
			side = input.nextDouble();
			
			area = side + side + side;
			
			System.out.print("Perimeter of Triangle : "+ area);
		}
        //--------------------------------------------------------
	}

}
