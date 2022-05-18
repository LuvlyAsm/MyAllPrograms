package Constructor;

public class c1 {
	
	int x;
	int y;
	c1(int x,int y){
		x=x;   //here both are consider as local variable ,both x are local.It won't assign to global variable 
		       //so we have to use this keyword //if you didnt use this keyword,default value only return
		y=y;       
		
		
		this.x=x;   // x=6
		this.y=y;   // y=8
	}
    public static void main(String[] args) {
		c1 s=new c1(6,8);
		int z=s.x+s.y;
		System.out.println(z);
	}
}
