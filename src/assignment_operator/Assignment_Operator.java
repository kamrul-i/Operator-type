package assignment_operator;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		//--------------------------------------------------------
        try (Scanner input = new Scanner (System.in)) {
			double redius, area;
			
			System.out.print("Enter redius : ");
			redius = input.nextDouble();
			
			area = 2 * 3.1416 * redius ;
			
			System.out.printf("Perimeter of circle : %.2f", area);
		}
        //--------------------------------------------------------
	}

}
