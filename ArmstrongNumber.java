
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){

    
    Scanner sc=new Scanner(System.in);
      
        int n;
        int start=1;
        int end=10000;
        int len;
     
        for(int i=start;i<=end;i++)
        {
            n=i;
            len=order(n);
        int rev=0;
        int sum =0;
        int temp=n;

        while(n>0)
        {
            rev=n%10;
            // sum=(rev*rev*rev)+sum;
            sum=sum+(int)Math.pow(rev,len);

            n=n/10;

        }
    
        if(sum==temp)
        
              System.out.println("Number is armstrong:"+temp);

        
        // else
        // {
        //     System.out.println("numebr is not armstrong:");
        // }
        }

        sc.close();
    
    }

    public static int order(int n)
    {
        int len=0;
        while(n!=0)
        {
            len++;
            n=n/10;
        }
        return len;
    }
}
