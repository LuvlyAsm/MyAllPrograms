import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		Array2 arr=new Array2();
		arr.array[0]=10;
		System.out.println(Arrays.toString(arr.array));
		arr.array[1]=20;
		System.out.println(Arrays.toString(arr.array));
	}
}
