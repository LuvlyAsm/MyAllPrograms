import java.util.*;

public class Second {
	public static void main(String[] args) {
	
		int n=5,k=0,count=0,high=0,c2=0,total=0;
		ArrayList<Integer> list=new ArrayList<>();
		int array[]= {1,2,3,4,5};
		for(int i=0;i<array.length;i++) {
			count=0;
			for(int j=0;j<array.length;j++) {
				if((array[i]+array[j])%k !=0) {
					if(list.isEmpty()) {
						list.add(array[i]);}
					else {list.add(array[j]);}
				}
			}
			for(int l=1;l<list.size();l++) {
				c2=1;total=0;
				for(int m=i+1;m<list.size();m++) {
					total=list.get(l)+list.get(m);
					if(total%k !=0) {
						c2++;
					}
					
				}
				if(c2==0) {
					c2++;
				}
				if(c2>high) {

					high=c2;
				}
				
			}
			list.clear();
			
		}
	
		System.out.println(high);
	}

}
