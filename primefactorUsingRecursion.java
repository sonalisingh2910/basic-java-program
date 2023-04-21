import java.util.*;
public class primefactorUsingRecursion {
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      System.out.println("Prime Factor of "+n+"are:");
   
    primeFactor(n,2);
  
  
  }

  public static void primeFactor(int n,int f)
  {
    if(n<=1)
    return ;
    if(n%f==0)
    {
      System.out.print(f+" ");
      primeFactor(n/f, f);
    }
    else{
     primeFactor(n, f+1);
  }
  sc.close();
  }
}
