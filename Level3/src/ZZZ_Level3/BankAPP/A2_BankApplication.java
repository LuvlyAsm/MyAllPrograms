package ZZZ_Level3.BankAPP;

import java.util.*;

class Bank{
    Scanner sc=new Scanner(System.in);
    private String name;
    private String pass;
    private int amount;
    ArrayList<String> transHist=new ArrayList<String>();
    Bank(String name,String pass,int amount)
    {
        this.name = name;
        this.pass = pass;
        this.amount=amount;
    }

    String getName() {
        return name;
    }
    String getPass() {
        return pass;
    }
    void operation(){
        System.out.println("\nEnter 1 for Deposit\nEnter 2 for Withdrawl\nEnter 3 for Balance\nEnter 4 for Transaction History\nEnter 5 for exit");
        int num=sc.nextInt();
        switch(num){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                balance();
                break;
            case 4:
                transaction();
                break;
            case 5:
                exit();
                break;
        }
    }
    void deposit(){
        System.out.print("Enter amount to be Deposited: ₹");
        int dep=sc.nextInt();
        amount=amount+dep;
        System.out.println("After Deposit Your Balance is: ₹"+amount);
        transHist.add("+"+dep);
        operation();
    }
    void withdraw(){
        System.out.print("Enter amount to be Withdrawed: ₹");
        int wid=sc.nextInt();
        amount=amount-wid;
        System.out.println("After Withdrawl Your Balance is: ₹"+amount);
        transHist.add("-"+wid);
        operation();
    }
    void balance(){
        System.out.println("Your Balance is: ₹"+amount);
        operation();
    }
    void transaction(){
        if(transHist.isEmpty()){
            System.out.println("No transaction has been made");
        }
        else{
            System.out.println("Transaction History is:-");
            for(String s: transHist){
                System.out.println(s);
            }
        }
        operation();
    }
    void exit(){
        System.out.println("Thank you!!\n");
    }
}
public class A2_BankApplication{
    public static void main(String[] args) {
        validation();
    }
    static void validation(){
        ArrayList<Bank> accounts = new ArrayList<Bank>();
        Bank c1 = new Bank("Arthi", "3005",1200);
        Bank c2 = new Bank("Priya", "1108",1800);
        Bank c3 = new Bank("Atchu", "0103",1400);
        Bank c4 = new Bank("Dikshu", "1402",1500);
        accounts.add(c1);
        accounts.add(c2);
        accounts.add(c3);
        accounts.add(c4);
        while(true){
            Scanner scan=new Scanner(System.in);
            System.out.println("WELCOME!!!");
            System.out.println("Select any one\n1 : New User\n2 : Existing User");
            String n=scan.next();
            if(n.equals("1")){
                System.out.print("Enter a Username: ");
                String name=scan.next();
                System.out.print("Enter new Password: ");
                String pass=scan.next();
                System.out.print("Enter your account Balance: ₹");
                int amount=scan.nextInt();
                Bank e=new Bank(name,pass,amount);
                accounts.add(e);
                System.out.println(accounts);
                e.operation();
            }
            else if(n.equals("2")){
                System.out.println("Enter Username:");
                String name=scan.next();
                System.out.println("Enter Password:");
                String pass=scan.next();
                int count=0;
                for (Bank s : accounts)
                {
                    if(name.equals(s.getName()) && pass.equals(s.getPass())){
                        s.operation();
                        count=1;
                        break;
                    }
                }
                if(count==0){
                    System.out.println("Invalid username or password\n");
                }
            }
            else{
                System.out.println("Invalid\n");
            }
        }
    }
}
