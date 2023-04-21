import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int rev;
        int temp=n;
        while(n!=0)
        {
            rev=n%10;
            sum=sum*10+rev;
            n=n/10;

        }
        if(temp==sum)
        {
            System.out.println("number is palindrome 89" + sum);
        }
        else
        System.out.println("number is not palindrome " + sum);
        sc.close();
    }
}
