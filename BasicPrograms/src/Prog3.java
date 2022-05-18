import java.util.Scanner;

//3.summation of numbers in given range
public class Prog3 {
     public static void main(String[] args) {
 		System.out.println("Type numbers to get summation");
 		Scanner scan=new Scanner(System.in);
 		int startRange=scan.nextInt();
 		int endRange=scan.nextInt();
 		int res=0;
 		for(int i=startRange;i<=endRange;i++)
 		{
 			res+=i;
 		}
 		System.out.println(res);
 	}
}
