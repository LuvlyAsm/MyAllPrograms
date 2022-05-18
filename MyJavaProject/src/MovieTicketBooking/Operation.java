package MovieTicketBooking;

import java.util.Scanner;

public class Operation {

	//Tickets
	int Movie1Ticket[]=new int[100];
	int Movie2Ticket[]=new int[100];
	
	
	//Switch
void Switchh(){
		Scanner scan =new Scanner(System.in);
		
		System.out.println("\n1.ICE AGE \n2.EXPENDABLES");
		int n=scan.nextInt();
		switch(n) {
		case 1:Movie1 m1=new Movie1();
				m1.MenuSwitch1();
		       break;
		       
		case 2:Movie2 m2=new Movie2();
			   m2.MenuSwitch2();
				break;
				
		default :System.err.println("Input Invalid");
				Switchh();
				break;	}
		}

class Movie1 {
	
	Scanner scan=new Scanner(System.in);
	
	void MenuSwitch1() {
		
		System.out.println("\n1.Booking \n2.Cancel a Ticket \n3.View Tickets \n4.Main Menu \n5.Exit");
		int input=scan.nextInt();
		
		switch(input) {
		case 1: Book();
	       break;
		case 2: Cancel();
	       break;
		case 3: ViewTickets();
			break;
		case 4: 
			   Switchh();
		       break;
		case 5:break;
		
		default : System.err.println("Invalid Input");
		MenuSwitch1();
		break;
		}
	}
	
	
void Book() {
		System.out.println("Enter Seat Number to Book");
		int num=scan.nextInt();
		if(Movie1Ticket[num-1]==0) {
						
			Movie1Ticket[num-1]=1;
			System.out.println("Ticket Booked");
			ViewTickets();
			MenuSwitch1();
		}
		else {System.out.println("Seat Not Available.. Book another Seat");	}
		ViewTickets();
}
	
void Cancel() {
		System.out.println("Enter a Seat number to Cancel");
		int num=scan.nextInt();
		if(Movie1Ticket[num-1]==1) {
			Movie1Ticket[num-1]=0;
			System.out.println("Ticket Cancelled");}
		else {System.out.println("Ticket Not Booked Yet...");}
	}

void ViewTickets() {
	System.out.println("------Screen-1-------");
	for(int i=0; i<Movie1Ticket.length;i++) {
				if(i%10==0) {
					System.out.println();
					System.out.print(Movie1Ticket[i]+" ");
				}
				else {System.out.print(Movie1Ticket[i]+" ");}
	
	}
	System.out.println("\n0 --> Available \n1 --> Booked ");
	MenuSwitch1();
}

}

class Movie2 {
	
	Scanner scan=new Scanner(System.in);
	
	void MenuSwitch2() {
		
		System.out.println("\n1.Booking \n2.Cancel a Ticket \n3.View Tickets \n4.Main Menu \n5.Exit");
		int input=scan.nextInt();
		
		switch(input) {
		case 1: Book();
	       break;
		case 2: Cancel();
	       break;
		case 3: ViewTickets();
			break;
		case 4: 
			   Switchh();            //operation's Swittch
		       break;
		case 5:
			break;
		default : System.err.println("Invalid Input");
				MenuSwitch2();
				break;
		}
	}
	
	
void Book() {
		System.out.println("Enter Seat Number to Book");
		int num=scan.nextInt();
		if(Movie2Ticket[num-1]==0) {
						
			Movie2Ticket[num-1]=1;
			System.out.println("Ticket Booked");
			ViewTickets();
			MenuSwitch2();
		}
		else {System.out.println("Seat Not Available.. Book another Seat");	}
		ViewTickets();
}
	
void Cancel() {
		System.out.println("Enter a Seat number to Cancel");
		int num=scan.nextInt();
		if(Movie2Ticket[num-1]==1) {
			Movie2Ticket[num-1]=0;
			System.out.println("Ticket Cancelled");}
		else {System.out.println("Ticket Not Booked Yet...");}
	}

void ViewTickets() {
	System.out.println("------Screen-2------");
	for(int i=0; i<Movie2Ticket.length;i++) {
		if(i%10==0) {
			System.out.println();
			System.out.print(Movie2Ticket[i]+" ");
		}
		else {System.out.print(Movie2Ticket[i]+" ");}
	}
	System.out.println("\n0 --> Available \n1 --> Booked ");
	MenuSwitch2();}}





}


