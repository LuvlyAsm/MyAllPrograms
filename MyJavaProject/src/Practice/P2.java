package Practice;

import java.util.ArrayList;

public class P2 {
	public static void main(String[] args) {
		String s="Hello Guys From Instagram";    //o/p Instagram From Guys Hello
		s=s+" ";
		String temp="";
		
ArrayList<String> list=new ArrayList<>();
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==' ') {
		list.add(temp);
		temp="";}
	else {
		temp=temp+s.charAt(i);
	}
}
System.out.println(list);
for(int i=list.size()-1;i>=0;i--) {
	temp=temp+list.get(i)+" ";
}
System.out.println("Input  : "+s);
System.out.println("Output : "+temp);
		
	}

}
