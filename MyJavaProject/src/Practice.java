import java.util.*;
public class Practice {	
	public static void main(String[] args) {
		int first,second,third;
		first=0;
		second=1;
		int count=0;
		while(count<10) {
			System.out.println(first);
			third=first+second;
			first=second;
			second=third;
			count++;
		}		
		
	}
    
	
}
/*

*/