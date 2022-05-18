package Level3Practice.BankApp2;

public class AccLogIn {
    String name,password,temp="";
    int amount;

    //Validation
    AccLogIn(){}
    AccLogIn(String Cname,String pass,int amt){
        this.name=Cname;
        Encryption(pass);
        this.password=temp;
        this.amount=amt;
        System.out.println(name+":"+password+":"+amount);
    }
    //Return name
    String getName(){return name;}
    String getPass(){return password;}

    //Encryption
    void Encryption(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            temp = temp + (char) (pass.charAt(i) + 1); }
        System.out.println("");
    }

    //LogIn Operations
    void LogInOperation(){
        System.out.println("Logged IN Successfully");
        System.out.println("\n1.Create Gift Card\n2.TopUp\n3.Transaction History\n4.Block\n5.LogOut");
        LogInOperations log=new LogInOperations();
        switch(5){
            case 1:log.CreateGiftCard();
                break;
            case 2:log.TopUp();
                break;
            case 3:log.TransactionHistory();
                break;
            case 4:log.Block();
                break;
            case 5:log.LogOut();
                break;
        }
    }
}