package Level3Practice.BankApp2;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class LogInOperations {

    void CreateGiftCard(){
        Random r=new Random();
        int Pin=r.nextInt(9);
        if(Pin<=999 && Pin >=99){
            Pin=Pin*10; }
        else if(Pin<=99 && Pin>=9){
            Pin=Pin*100; }
        else if(Pin<10){
            Pin=Pin*1000; }
        else if(Pin==0){
            CreateGiftCard(); }


        int ID=10000;
        TreeMap m=new TreeMap();
        m.put(ID,Pin);
        ID++;
    }

    void TopUp(){}

    void TransactionHistory(){}

    void Block(){}

    void LogOut(){}

}
