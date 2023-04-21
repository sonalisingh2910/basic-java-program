import java.util.*;
public class amstrong {
    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a numebr :");
           int num=sc.nextInt();
        
           int len;
           len=order(num);
           if(Armstrong(num ,len))
           {
            System.out.println(num+"is armstrong");

           }
           else{
            System.out.println(num+"is not armstrong");
           }
           sc.close();

    }
    static int order(int num)
    {
        int len=0;
        while(num!=0)
        {
            len++;
            num=num/10;
        }
        return len;
    }

    public static boolean Armstrong(int num,int len)
    {
        int sum=0,temp,digit;
        temp=num;
        while(temp!=0)
        {
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp/=10;

        }
        return num==sum;
    }
}

