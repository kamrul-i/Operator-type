package temperature_Demo;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			double cels, fahren;
			
			System.out.print("Fahrenheit = ");
			fahren = input.nextDouble();
			
			cels = 0.5556 * (fahren - 32);
			System.out.printf("Celsius : %.2f" ,cels);
		}

	}

}
