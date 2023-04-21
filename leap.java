
//How to Print the Next N Leap Years in Java?
import java.util.*;
public class leap {
    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        System.out.println("enter number of years you want to print:");
        int n=sc.nextInt();  // n is the no of leap years after year 2020
        // that is needed to print
        int count=0;
         // Creating and initializing a variable
        // to maintain count of leap years
      while(count!=n)
      {
       year = year+1;
        if((year%400==0)||(year%4==0)&&(year%100!=0))
        {
           count ++;
            System.out.println("leap yaer is"+year);
        }
      }
      sc.close();
    }
}
