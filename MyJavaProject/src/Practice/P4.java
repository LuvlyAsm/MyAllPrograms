package Practice;
import java.util.ArrayList;

public class P4 {
	public static void main(String[] args) {
		String str="Hii Guys From Me",temp=""; // o/p
		str=str+" ";
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') 
			{
				list.add(temp);
				temp="";
			}
			else {
				temp=str.charAt(i)+temp;
			}
		}
		
		for(int i=0;i<list.size();i++) {
			temp=temp+list.get(i)+" ";
		}
		System.out.println("Input  : "+str);
		System.out.println("Output : "+temp);
	}

}
