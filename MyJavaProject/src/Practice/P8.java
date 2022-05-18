package Practice;

public class P8 {
	public static void main(String[] args) {
		int i=1000,j=0;
		j=find(i);
		System.out.println(j);
	}
	static int find(int j) {
		if(j>1) {
			j=find(j/10)+(j%10);
		}
		else {
			j=0;
		}
		return j;
	}
}
