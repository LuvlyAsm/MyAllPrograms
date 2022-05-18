package ZZZ_Level3.MovieTicketBook;

import java.util.Scanner;

public class A1_MovieTicketBooking {
    public static void main(String[] args){
        System.out.println("Welcome ..! Book Your Movie Tickets :)");
        Booking();

    }
    static void Booking(){
        Operation op=new Operation();
        op.SwitchStatement();
    }
}

class Operation{

    Scanner scan=new Scanner(System.in);
    int Seats[]=new int[600];


 void viewSeats(){
        for(int j=0;j<Seats.length;j++){
            if(j%30==0){
                System.out.println();
                System.out.print(Seats[j]+" ");
            }
            else if(j%10==0){
                System.out.print("      ");
                System.out.print(Seats[j]+" ");
            }

            else{ System.out.print(Seats[j]+" ");}
        }
        SwitchStatement();
    }


 void Book(){
            System.out.println("\n\nEnter a Seat Number : ");
            int sNum = scan.nextInt();
            if(Seats[sNum-1]==0){
                Seats[sNum-1]=1;
                System.out.println("\nYour Seat Booked Successfully");
            }
            else{
                System.out.println("\nSeat Already Booked... Try Another");
            }
         viewSeats();
         SwitchStatement();
        }


void Cancel(){
    System.out.println("\nEnter your seat number to cancel");
    int sNum=scan.nextInt();
    if(Seats[sNum-1]==1){
        Seats[sNum-1]=0;
        System.out.println("\nYour Ticket Cancelled Successfully");
    }
    else{
        System.out.println("\nTicket is not Booked");
    }
    viewSeats();
    SwitchStatement();
 }

 void SwitchStatement(){
     System.out.println("\n1.View Seats \n2.Book Ticket \n3.Cancel a Ticket \n");
     int S= scan.nextInt();
     switch(S){
         case 1:viewSeats();
             break;
         case 2:
             Book();
             break;
         case 3:
             Cancel();
             break;
       }
    }
}
