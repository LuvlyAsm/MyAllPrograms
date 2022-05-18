package Level3Practice.BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    String name,password;
    int amount;
    Scanner scan=new Scanner(System.in);
    //constructor
    Bank(String name,String password,int amount){
        this.name=name;
        this.password=password;
        this.amount=amount;}

    //return for check
        String getName(){return name;}
        String getPass(){return password;}

    void Operation(){
        System.out.println("Enter to Continue\n1.Deposit\n2.Withdraw\n3.Balance\n4.Transaction History\n5.LogOut\n");
        int n=scan.nextInt();
        switch(n){
            case 1:Deposit();
                break;
            case 2:Withdraw();
                break;
            case 3:Balance();
                break;
            case 4:Transaction();
                break;
            case 5:LogOut();
                break;
            default:
                System.out.println("Invalid");
                Operation();
        }
    }

    ArrayList transHist=new ArrayList<>();

    void Deposit(){
        System.out.println("Enter a Amount to be Deposit...");
        int dep=scan.nextInt();
        amount=amount+dep;
        System.out.println("After Deposit Account Balance is "+amount);
        transHist.add("+"+dep);
        Operation();
    }
    void Withdraw(){
        System.out.println("Enter How Much You Want to Withdraw...");
        int wid=scan.nextInt();
        amount=amount-wid;
        System.out.println("Your Account Balance is "+amount);
        transHist.add("-"+wid);
        Operation();
    }
    void Balance(){
        System.out.println("Your Account Balance is "+amount);
        Operation();
    }

    void Transaction(){
        for(int i=0;i<transHist.size();i++){
            System.out.println(transHist.get(i));
        }
        Operation();
    }
    void LogOut(){
        System.out.println("Successfully Logged Out...");
        Main m=new Main();
        m.Validation();
    }
}
