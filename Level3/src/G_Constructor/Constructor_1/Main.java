package G_Constructor.Constructor_1;

public class Main {
    public static void main(String[] args) {
        int i=0;
        int j=2;
        Main m=new Main(i,j);
        Main m1=new Main();
    }
    int num,num2,res;
    Main(int i,int j){
     this.num=i;
     this.num2=j;
     res=i+j;
        System.out.println(res);
    }
    Main(){
        System.out.println("Welcome");
    }
}
