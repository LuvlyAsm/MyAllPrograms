import java.util.*;
public class Aspire{

static Scanner scan=new Scanner(System.in);

   public static void main(String[] args)
    {
             System.out.println("Click \n1.Sum Of Digits \n2.Multi Dimensional Arrays \n3.String program");

              int option=scan.nextInt();
              switch(option)
	{
		case 1:sumOfDigits();
          		         break;
		case 2:multiDimArray();
         		          break;
		case 3:stringProgram();
      		           break;
		default:System.out.println("Invalid Input"); 
	}

      }

    static void sumOfDigits()
      {
      System.out.println("Enter a number");  
      int num=scan.nextInt(),sum=0,rem=0,num2=num;
          while(num>0){
         rem=num%10;
         sum=sum+rem;
         num=num/10;
          }
     System.out.println("Sum of Digit of "+num2+" is "+sum);
       }

    static void multiDimArray()
      {
        int array[][]={
		{1,2,3},   //00 01 02
		{4,5,6},   //10 11 12
        {7,8,9}    //20 21 22
                              };

       System.out.println("Diagonal 1 is :");
       for(int i=0;i<array.length;i++){
       System.out.println(array[i][i]);
		}

       System.out.println("Diagonal 2 is :");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
             if(i+j==array.length-1)
                 System.out.println(array[i][j]);
             } 
       }
       }
    static void stringProgram()
     {
        String s="AKBAR";
        for(int i=0;i<s.length();i++){
         int a=s.charAt(i)+1;
        System.out.println((char)a);
         }
       }
}