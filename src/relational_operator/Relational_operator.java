package relational_operator;

import java.util.Scanner;

public class Relational_operator {
	public static void main(String[] args) {
		
		
		
		try (Scanner input = new Scanner(System.in)) {
			int number;

			System.out.print("Enter any number : ");
			number = input.nextInt();
			
			if (number > 0) {
			    System.out.print("Positive");
			}else if(number < 0){
			    System.out.print("negative");
			}else{
			    System.out.print("Zero"); 
			}
		}
		
		//প্রত্যেকটি symble এর ব্যবহার commit আকারে github-এ আলোচিত আছে।।   https://github.com/kamrul-i
		
		/*
		নিচের এ চিহ্ন গুলো relational opeator এর symble বা প্রতীক।। এ চিহ্নগুলো তার দু’পাশের দুটি মানের মধ্যে সমন্বয় করে।। 
		কোনটি কিরকম সমন্বয় বুঝায়, তা পাশে আলোচিত হলো।।
		
		>    greater than 			 [এটার মানে বাম সাইডের মান থেকে ডান সাইডের মান বড় ছোট ।। ]
				
		>=   greater than or equal   [এটার মানে বাম সাইডের মান থেকে ডান সাইডের মান ছোট বা সমান ।। ]
				
		<    less than     			 [এটার মানে বাম সাইডের মান থেকে ডান সাইডের মান বড় ।। ]
				
		<=   less than or equal      [এটা বাম সাইডের মান থেকে ডান সাইডের মান বড় বা সমান বুঝায়।। ]
				
		==   equal   				 [এটা বাম সাইডের মান এবং ডান সাইডের মান সমান বুঝায়।। ]
				
		!=   not equal   			 [এটার মানে বাম সাইডের মান এবং ডান সাইডের মান সমান নয় ।। ]
		
		*/
	}

}
