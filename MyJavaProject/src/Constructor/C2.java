package Constructor;

public class C2 {
	
	String name,pass;
	int amount;
	C2(){
		System.out.println("Default Constructor C2");}
	
	C2(int s){
		System.out.println(s+s);
	}
	C2(int s,char ch){
		System.out.println(s+"    "+ch);
	}
	
	C2(String s){
		System.out.println(s+"   Love");
	}
	
	C2(int i,int j){
		C3 obj=new C3(i,j);
	}
	
	C2(String Name,String password,int amt){
		this.name=Name;
		this.pass=password;
		this.amount=amt;
		
	}
	private String getName() {
		return name;
	}
	private String getPass() {
		return pass;
	}
	
}
