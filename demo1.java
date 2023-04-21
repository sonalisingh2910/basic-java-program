//maximum dublicate element

import java.util.*;
public class demo1
{

  public static void maxdublicate(int[] arr)
  {
     int count;

     int n=arr.length;
    for(int i=0;i< arr.length;i++)
    {
       count=0;
      for(int j=i+1;j< arr.length;j++)
         {
          if(arr[i]==arr[j])
          {
            
              count++;
              

          }
         }
         if(count==n/2)
         {
           System.out.print(arr[i]);
         }

    }
   

  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      maxdublicate(arr);
     
  
  
  }

  
}