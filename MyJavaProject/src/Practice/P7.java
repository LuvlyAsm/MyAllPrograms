package Practice;

public class P7 {
	
	public static void main(String[] args) {
		int i,j = 0;
		for(i=0;i<=4;i++) 
			j=inc(i);
		System.out.println(j);

		}
	static int inc(int i) {
		int count=5;
		count=count+i;
		return count;
	}
}
