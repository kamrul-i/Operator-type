package relational_operator;

import java.util.Scanner;
 
public class Logical_Operator {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			char ch;
			System.out.print("Enter any letter : ");
			ch = input.next().charAt(0);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("vowel");
			}else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("vowel");
				
			}else if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
				System.out.println("consonent.");
			}else if(ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'V' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
				System.out.println("consonent.");
			}else {
				System.out.println("Sorry ! you haven't written any letter.");
			}
		}
		
		
	}

}
