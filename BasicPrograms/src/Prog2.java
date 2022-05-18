import java.util.Scanner;

//2.product of given number in given range
public class Prog2 {
	public static void main(String[] args) {
		System.out.println("Type numbers to get product");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		
		if(num>=0 && num<=100 && num2>=0 && num2<=100 ) {
			int res=num*num2;
			System.out.println("Result is "+res);
		}
		else {
			System.out.println("numbers not in range.. Range is 0 to 100");
		}
	}
}
