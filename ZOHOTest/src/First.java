
public class First {
	public static void main(String[] args) {
		
		int n=4,k=2,count=0,total=0;
		int[] arr= {2,4,6,10};  //o/p
		
		for(int i=0;i<arr.length;i++) {
			total=0;
			if(arr[i]==k) {          //to eliminate k==number
				continue;
			}
			for(int j=0;j<arr.length;j++) {
				if(i==j) {continue;}
				total=arr[i]+arr[j];
		
				if(total==k) {
					System.out.println("Entered"+total+" i ="+i +" j= "+j);
					count++;
				}
			}
			
		}
		if(count==0) {
			count++;
		}
		System.out.println(count);
		
	}
}
/*

 
 */
