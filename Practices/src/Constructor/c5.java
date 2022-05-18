package Constructor;

public class c5 {
      //Constructor Calling
	
	c5(){
		this("Hii");
		System.out.println("def");
		
	}
	c5(String s)
	{
		this(s,4);
	     System.out.println("Constructor Calling from c5(String s)");
	    
	}
	
	c5(String s5,int n){
		
	     System.out.println("Constructor Calling from c5(String s1,String s2)");	
		
	}
	
	c5(String s1,String s2,String s3){
		System.out.println("Called Constructor");
	}
}
