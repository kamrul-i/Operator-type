package temperature_Demo;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double cels, fahren;
			
			System.out.print("Celsius = ");
			cels = input.nextDouble();
			
			fahren = 1.8 * cels + 32;
			System.out.println("Fahrenheit : "+fahren);
		}
	}
}
