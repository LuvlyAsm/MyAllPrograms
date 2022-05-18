import java.util.ArrayList;

public class forEach {
	public static void main(String[] args) {
	 
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		for(int s:list)
			System.out.println(s);
	}

}
