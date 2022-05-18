package ZZZ_Level3.BalloonProblem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Put your Balloon");
        char array[][]=new char[3][3];
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                array[i][j]='='; } }
        int a=array.length-1;
        int b=array.length-1;
        int c=array.length-1;
        operation(array,a,b,c);
    }
    static void show(char[][] array,int a,int b,int c){

        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                System.out.print("  "+array[i][j]); }
            System.out.println();}
        System.out.println("Do you wanna Continue?");
        Scanner scan=new Scanner(System.in);
        String s=scan.next();

       if(s.charAt(0)=='y' || s.charAt(0)=='Y'){
            operation(array,a,b,c); }

    }
    static void operation(char[][] array,int a,int b,int c){
        System.out.println("Enter row num");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("Enter Balloon colour to Insert");
        String col=scan.next();
       if(a>=0 || b>=0 || c>=0){
           if(a>=0 && num==0){
               array[a][num]=col.charAt(0);
               a--;}
           else if(b>=0 && num==1){
               array[b][num]=col.charAt(0);
               b--;
           }
           else if(c>=0 && num==2){
               array[c][num]=col.charAt(0);
               c--; }
       }
        else{
            System.out.println("Row filled");
        }
        show(array,a,b,c);
    }
}
