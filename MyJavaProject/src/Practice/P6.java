package Practice;
import java.util.*;
public class P6 {
	public static void main(String[] args) {
		int array[]= {1,1,1,1,1,1,2,2,2,3,4,4,4,5,5};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			al.add(array[i]);
		}
		System.out.println(al);
		
		HashSet s=new HashSet(al);
		System.out.println(s);
	}

}
