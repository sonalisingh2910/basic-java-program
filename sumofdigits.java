import java.util.*;
public class sumofdigits {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev;
        while(n!=0)
        {
        rev=n%10;
        sum=sum+rev;
        n=n/10;
        }
        System.out.println("sum of digits is"+sum);
        sc.close();
    }
    
}
