
//Pascal Triangle
public class A1 {
	public static void main(String[] args) {
		int num=15;
		int space=num;
		for(int i=0;i<num;i++) {
			for(int s=0;s<space;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			space--;
			System.out.println();
		}
	}
}
