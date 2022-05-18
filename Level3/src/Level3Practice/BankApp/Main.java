package Level3Practice.BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){ Validation();    }
    static void Validation(){
        ArrayList<Bank> accounts=new ArrayList<>();
        Bank b1=new Bank("ASM","Password@123",1200);
        Bank b2=new Bank("Kavi","Password@1234",1100);
        Bank b3=new Bank("Ravi","Password@123456",1000);
        Bank b4=new Bank("Mahesh","Password@123456",1000);
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        accounts.add(b4);

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our ABC Bank...\nEnter to continue....\n1.LogIn\n2.Signup");
        int n = scan.nextInt();
        if(n==1){
            System.out.println("Enter Username");
            String name=scan.next();
            System.out.println("Enter Password");
            String pass=scan.next();
            for(Bank s:accounts){
               if(name.equals(s.getName())&&pass.equals(s.getPass())){
                   System.out.println("Logged In Successfully");
                   s.Operation();}
               else{ System.out.println(); }
               }
        }
        else if(n==2){
            System.out.println("Enter Username");
            String name=scan.next();
            System.out.println("Enter Password");
            String pass=scan.next();
            System.out.println("Enter amount to deposit");
            int amt=scan.nextInt();
            Bank b=new Bank(name,pass,amt);
            accounts.add(b);
            b.Operation();
        }
        else{
            System.out.println("Input Invalid");
        }
    }
}
