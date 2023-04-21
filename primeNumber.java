
import java.util.*;
public class primeNumber {

    public  static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
     if(count==2)
     {
       System.out.println("Prime number ");
     }

     else{
        System.out.println("not  a prime");
     }
sc.close();


    // prime number in given range//
    // System.out.println("Enter a lower limit :");
 
    //    int lowerlimit=sc.nextInt();

    //    System.out.println("Enter a uper limit :");
        
    //    int uperlimit=sc.nextInt();

    //    int count=0;

    //    for(int i=lowerlimit;i<=uperlimit;i++)
    //    {
        
    //     count=0;
    //       for(int j=1;j<=i;j++ )
    //       {
    //         if(i%j==0)
    //         {
    //             count++;
    //         }
         
    //     }
    //     if(count==2)
    //     {
    //         System.out.println("prime number" +i);
    //     }
    
    // }

    // int flag=0;
    // for(int i=2;i*i<=n;i++)
    // {
    //     if(n%i==0)
    //     {
    //     flag=1;
    //     break;
    //     }
    // }
    // if(flag==1)
    // {
    //     System.out.println("Not a prime number");
    // }
    // else
    // {
    //     System.out.println("prime number");
    // }

    }
    
}
