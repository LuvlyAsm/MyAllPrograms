package Constructor;

public class c2 {
	static int x;
      public static void main(String[] args) {
    	  c2 ss=new c2();
    	  System.out.println(ss.x);
    	  c2 s=new c2(6);
    	  System.out.println(s.x);
    	  c2 sss=new c2();
    	  System.out.println(sss.x);
	}
      c2(int x){
    	  this.x=x;
      }
      c2(){
    	  System.out.println(x);
      }
}
