package Practice;

public class P1 {
	
public static void main(String[] args) {
	
	int n=10;
	
	for(int i=0;i<n;i++) {
		for(int space=i;space<n;space++) {
			System.out.print(" ");
		}
		for(int dot=0;dot<=i;dot++) {
			if(dot==0 || dot==i) {
				System.out.print("* ");
			}
			else {
				System.out.print("O ");
			}
		}
		System.out.println();
											}
	
	for(int i=0;i<n;i++) {
		for(int space=0;space<i;space++) {
			System.out.print(" ");
		}
		for(int dot=i;dot<n;dot++) {
			if(dot==i || dot==9) {
				System.out.print("* ");
			}
			else {
				System.out.print("O ");
			}
		}
		System.out.println();
	}
		
  }

}
