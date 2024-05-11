package unary_operator;

public class Unary_Demo {
	public static void main(String[] args) {
		
		
		
		int x = 10;
        int y;

        
        //Decrement Demo......................................
        y = --x;  //x=9
        System.out.println("y = "+y);
        
        y = x;   //x=9
        System.out.println("y = "+y);
        
        y = x--;  //x=9
        System.out.println("y = "+y);
        
        y = x;    //x= 8
        System.out.println("y = "+y);
	}

}
