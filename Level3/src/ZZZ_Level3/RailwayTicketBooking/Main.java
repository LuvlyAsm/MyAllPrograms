package ZZZ_Level3.RailwayTicketBooking;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome...");
        Operation();
    }
    static void Operation(){
        Scanner scan=new Scanner(System.in);
        //loop is for entry point if it is true and exit point if it is false
        boolean loop=true;

        //Main Menu Operations
    while(loop){
            System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Print Booked Tickets \n4.Print Available Tickets \n5.Exit");
            int n=scan.nextInt();
            switch(n){
                    case 1:{
                        System.out.println("Enter Your Name:");
                        String name=scan.next();
                        System.out.println("Enter Your Age:");
                        int age=scan.nextInt();
                        System.out.println("Enter Your Gender[M/F]");
                        String gender=scan.next();
                        System.out.println("Enter Your Berth Preference[U/L/M]:");
                        String bp=scan.next();
                        Passenger p=new Passenger(name,age,gender,bp);
                        break;
                    }
                    case 2:{}
                    case 3:{}
                    case 4:{}
                    case 5:{
                        System.out.println("exit");
                        loop=false;
                        break;
                          }
                default :
                    System.out.println("invalid input");
                    loop=false;
                    break;
            }//switch case end
         } //while loop end

    }

}
