package Constructor;

public class c4 {
	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
		
		
	}
	private static void m1() {
		System.out.println("---------------Default constructor-------------------");
		c3 a=new c3();
		System.out.println(a.name);
		System.out.println(a.number);
		System.out.println(a.degree);
		System.out.println("--------------------------------------------------------");
	}
	private static void m2() {
		System.out.println("--------------1 Parameter constructor-------------------");
		c3 a=new c3("Ashi");
		System.out.println(a.name);
		System.out.println(a.number);
		System.out.println(a.degree);
		System.out.println("--------------------------------------------------------");
	}
	private static void m3() {
		System.out.println("--------------2 Parameter constructor-------------------");
		c3 a=new c3("Nilo",1234567890);
		System.out.println(a.name);
		System.out.println(a.number);
		System.out.println(a.degree);
		System.out.println("--------------------------------------------------------");
	}
	private static void m4() {
		System.out.println("--------------3 Parameter constructor-------------------");
		c3 a=new c3("ASM",1234567890,"B.E");
		System.out.println(a.name);
		System.out.println(a.number);
		System.out.println(a.degree);		
		System.out.println("--------------------------------------------------------");
	}

}
