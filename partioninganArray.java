import java.util.*;
public class partioninganArray {
    
    public static void partion(int[] arr, int pivot)
    {
        int i=0;
        int j=0;
        
        while(i<arr.length)
        {
           
            if(arr[i]>pivot)
            {
                i++;
            }
            else{
               swap(arr, i,j);
                i++;
                j++;
            }

          
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array you want to store:");
         int n=sc.nextInt();
         int[] arr= new int[n];
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
         System.out.println("Enter the pivot:");
         int pivot=sc.nextInt();
         partion(arr,pivot);
         print(arr);
         sc.close();

    }
}
