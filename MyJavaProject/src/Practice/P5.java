package Practice;
import java.util.*;
public class P5 {
	public static void main(String[] args) {
		int array[]= {1,1,1,2,3,4,0,4,4,4,6};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			s.add(array[i]);
		}
		System.out.println(s);
	}
}
