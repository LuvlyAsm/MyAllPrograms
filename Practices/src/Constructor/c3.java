package Constructor;

public class c3 {
	String name;
	int number;
	String degree;
		
	 c3()
		 {
			 System.out.println("default constructor");
		 }
	 c3(String name)
		 {
			 this.name=name;
		 }
	 c3(String name,int number)
		 {
			 this.name=name;
			 this.number=number;
		 }
	  c3(String name,int number,String degree)
		 {
			 this.name=name;
			 this.number=number;
			 this.degree=degree;
		 }
 
}
