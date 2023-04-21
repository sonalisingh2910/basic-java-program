
import java.util.*;
public class duplicateArray {

    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array you wnat to store");
       int n=sc.nextInt();
       System.out.println("Enter the element of array");
       int[] arr= new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       boolean flag=false;
       int[] arr1=new int[n];
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j])
            {
                arr1[i]=arr[i];
                System.out.print(" "+arr1[i]);
                flag=true;
            }
        }
       }

       if(flag==false){
        System.out.println("Dulicate element not found:");
       }
       sc.close();
    }
    
}
