import java.util.*;
public class perfectNo {
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int sum=0;
       for(int i=1;i<num;i++)
       {
        if(num%i==0)
        {
            sum=sum+i;

            System.out.println(i+ " ");
        }

       }
       if(sum==num)
       {
        System.out.println(num+ "is perfect number ");
       }

       else{
        System.out.println(num+ "not a perfect number");
       }
       sc.close();
    }
}
