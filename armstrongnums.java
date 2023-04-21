import java.util.*;
public class armstrongnums {
    public static void main(String[] arsg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower and upper ranges : ");
        int low=sc.nextInt();
        int high=sc.nextInt();
       

        System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");
        for(int i=low;i<=high;i++)
        {
        int sum=0,temp,digit;
        int len;
        len=order(i);
        temp=i;
        while(temp!=0)
        {
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp/=10;
        }
        if(i==sum)
        {
            System.out.println(i+"");
        }

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

}
