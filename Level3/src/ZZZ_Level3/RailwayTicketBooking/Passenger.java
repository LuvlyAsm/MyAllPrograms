package ZZZ_Level3.RailwayTicketBooking;

public class Passenger {
String Name;
int Age;
String BerthPref;
String Gender;
int Id;
String allotted;

Passenger(String name,int age,String gender,String bp){
    this.Name=name;
    this.Age=age;
    this.Gender=gender;
    this.BerthPref=bp;
    allotted="  ";
    Id=-1;
    System.out.println("Constructor called");
}
}
