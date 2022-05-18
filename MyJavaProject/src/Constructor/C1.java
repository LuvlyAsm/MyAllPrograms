package Constructor;

import java.util.ArrayList;

public class C1 {
	public static void main(String[] args) {
		C2 obj=new C2();
		
		C2 obj1=new C2(20);
		C2 obj2=new C2(100,'S');
		C2 obj3=new C2("Hellow");
		C2 obj4=new C2(10,80);
		
		ArrayList<C2> list=new ArrayList();
		
		C2 a=new C2("ASM","Password",1234);
		C2 b=new C2("Ravi","Passwordd",1233);
		C2 c=new C2("Kavi","Passwordddd",1231);
		list.add(a);
		list.add(b);
		list.add(c);
		
		
		for(C2 l:list) {
					
				}
		
		
		System.out.println(list);		
		
		
	}

}
