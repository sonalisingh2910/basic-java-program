
import java.util.*;
public class oddoreven {

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number :");
       int n=sc.nextInt();
       sc.close();
       int r=num( n);
       System.out.println(""+r);
      
    }

    static int num(int n)
    {
        int result;
        if(n%2==0)
        {
            result=n;
            System.out.println("even number");
        }
        else 
        {
            result=n;
         System.out.println("odd number");
        }

        return result;
    }
    
}
