import java.util.*;
public class SortOFArray {
    

         public static int[] ByBruteFore(int[] arr)
         {
            int i;
            for( i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
             
            }
        return arr;
         }


    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of element you want to store:");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("Enter the element of array");
     for(int i=0;i<arr.length;i++)
     {
        arr[i]=sc.nextInt();
     }
    
     int[] a= ByBruteFore(arr);
    //  System.out.println("sorted  array :");
    //  for(int i=0;i<a.length;i++)
    //  {
    //     System.out.print(a[i]+" ");
    //  }

       System.out.println("sorted array:"+Arrays.toString(a));
    }
}
