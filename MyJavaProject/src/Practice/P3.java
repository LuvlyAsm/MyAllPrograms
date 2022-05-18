package Practice;

public class P3 {
	public static void main(String[] args) {
		String str="Hii Guys From Me",temp="";     //o/p eM morF syuG iiH
		
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println("Input  : "+str);
		System.out.println("Output : "+temp);
	}
}
