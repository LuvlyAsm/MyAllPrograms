package ZZZ_Level3.BankAPP;
import java.util.ArrayList;
import java.util.Scanner;

public class A3_BankApplication {
    public static void main(String[] args){
        Validation();
    }
    static void Validation(){
        Scanner scan =new Scanner(System.in);
        ArrayList<Bank1> accounts=new ArrayList<>();
        Bank1 b1= new Bank1("ASM","Password@123",1600);
        Bank1 b2= new Bank1("Ravi","Password@1234",1250);
        Bank1 b3= new Bank1("Kavi","Password@12345",1500);
        Bank1 b4= new Bank1("Mahesh","Password@123456",1550);
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        accounts.add(b4);
        System.out.println(accounts);
        System.out.println("\n1.LogIn \n2.Purchase");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter username");
                String name = scan.next();
                System.out.println("Enter Paassword");
                String pass = scan.next();

                for(Bank1 s: accounts)
                    if(name.equals(s.getName()) && pass.equals(s.getPassword())){
                        s.logIn(); }
                    else{
                        System.out.println("Invalid Username or Password"); }
               break;
            case 2:break;
        }

    }
}
class Bank1 {
    Scanner s = new Scanner(System.in);

    private String name, password,s2="";
    private int amount;
    public int c;
    int getAmount(){return amount;}

    //Default Constructor - we have to create Default Constructor to call Bank1's method.Because we overrided the default contructor below
    Bank1() { }

    //Constructor
    Bank1(String custName, String pass, int amt) {
        this.name = custName;
        String temp = "";
        for (int i = 0; i < pass.length(); i++) {
            temp = temp+(char)(pass.charAt(i) + 1);
        }
        this.password = temp;
        this.amount = amt;
    }

    //return name and password

    String getName() {
        return name; }

    String getPassword() {
            for(int j=0;j<password.length();j++){
                s2=s2+(char)(password.charAt(j)-1);}
        return s2; }


    void logIn() {
        System.out.println("Logged In Successfully\nEnter to Continue\n1.Create Gift Card\n2.TopUp\n3.Transaction History\n4.Block\n5.LogOut\n");
        int n=s.nextInt();
        LogInOperations l=new LogInOperations();
        switch(n){
            case 1:l.CreateGiftCard();
                    break;
            case 2:l.TopUp();
                    break;
            case 3:l.TransactionHistory();
                    break;
            case 4:l.Block();
                    break;
            case 5:l.LogOut();
                    break;
        }
    }

}

class LogInOperations{
int cardNum,PIN,points;
    A3_BankApplication v =new A3_BankApplication();
    Bank1 bb=new Bank1();

    void CreateGiftCard(){
        cardNum= 12345;
        PIN=1234;
        points=15;
        System.out.println("Your GiftCard Created Successfully\nCard Num ="+cardNum+"\nPIN ="+PIN);
        if(points==10){
            int amt=bb.getAmount()+10;
            Bank1 b1=new Bank1(bb.getName(),bb.getPassword(),amt);
            
        }
       v.Validation();
    }

    void TopUp(){}

    void TransactionHistory(){}

    void Block(){}

    void LogOut(){
        System.out.println("LoggedOut Successfully");
        v.Validation();
    }
}