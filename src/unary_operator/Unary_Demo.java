package unary_operator;

public class Unary_Demo {
	public static void main(String[] args) {
		
		
		
		int x = 10;
        int result;
        
        result = +x;
        System.out.println("Result : "+result);
        
        result = -x;
        System.out.println("Result : "+result);


        
        

        int y = -10;
        
        result = +y;
        System.out.println("Result : "+result);
        
        result = -y;
        System.out.println("Result : "+result);
        
        
        
        
        
        //Increment Demo..................................
        y = ++x;  //x=11
        System.out.println("y = "+y);
        
        y = x;   //x=11
        System.out.println("y = "+y);
               
        y = x++;  //x=11
        System.out.println("y = "+y);
        
        y = x;    //x= 12
        System.out.println("y = "+y);
        
        
        
 
        
        //Decrement Demo......................................
        y = --x;  //x=11
        System.out.println("y = "+y);
        
        y = x;   //x=11
        System.out.println("y = "+y);
        
        y = x--;  //x=11
        System.out.println("y = "+y);
        
        y = x;    //x= 10
        System.out.println("y = "+y);
	}

}
