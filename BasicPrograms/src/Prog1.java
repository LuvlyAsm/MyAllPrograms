import java.util.Scanner;

//1.entered char is alphabet or digit or special char

public class Prog1 {
      public static void main(String[] args) {
    	  Scanner scan=new Scanner(System.in);
    	  char ch=scan.next().charAt(0);
    	  if(ch>=65 && ch<=90 || ch>=97 && ch<=122 )
    	  {
    		  System.out.println(ch+" is Alphabet");
    	  }
    	  else if(ch>=48 && ch<=57)
    	  {
    		  System.out.println(ch+" is Number");
    	  }
    	  else {
    		  System.out.println(ch+" is Special Character");
    	  }
	}
}
