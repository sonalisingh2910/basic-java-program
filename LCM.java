import java.util.*;
public class LCM {

    public static void main(String[] args)
    {    int a,b,max,i,lcm;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers :");
        //   a=sc.nextInt();
        //   b=sc.nextInt();
        a=4;
        b=8;
          max= a>b?a:b;
          sc.close();
    
   for( i= max;i<a*b;i++)
        {
            if(i%a==0&&i%b==0)
            {
               break;
            }
          
        }
        lcm =i;
        System.out.println("lcm is"+lcm);
        
      

       
    }


}
