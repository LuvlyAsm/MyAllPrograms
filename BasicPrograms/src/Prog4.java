//4.factorial of numbers (1 to 5)
public class Prog4 {
     public static void main(String[] args) {
	   
	    for(int i=1;i<=5;i++) {
	    	factorial(i);
	    }	
	}
     static void factorial(int num)
     {
    	 int fact=num;
    	 int num2=num;
    	 while(num>1) {
    		 fact=fact*(num-1);
    		 num--;    		 
    	 }
		 System.out.println(num2+"! is "+fact);

    	 
     }
     
    //5! 5x4x3x2x1 / 
}
