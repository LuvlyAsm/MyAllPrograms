package Level3Practice.BankApp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Validation();
    }
    static void Validation(){
    ArrayList<AccLogIn> accounts=new ArrayList<>();
        AccLogIn a1=new AccLogIn("ASM","Password@123",12000);
        AccLogIn a2=new AccLogIn("Ravi","Password@1234",10000);
        AccLogIn a3=new AccLogIn("Kavi","Password@12345",11000);
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to ABC Bank\n1.Account Login\n2.Purchase");
        int n=scan.nextInt();
        if(n==1){
            System.out.println("Enter your name");
            String name=scan.next();
            System.out.println("Enter Password");
            String pass= scan.next();
            AccLogIn al=new AccLogIn();

            if(name.equals(al.getName())&&pass.equals(al.getPass())){
                al.LogInOperation();
            }
            else{
                System.out.println("Invalid Username or Password"); }
        }

        else if(n==2){
            Purchase p=new Purchase();
        }
        else {
            System.out.println("Invalid Input");
            Validation();
        }

    }
}
