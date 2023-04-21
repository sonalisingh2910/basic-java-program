import java.util.*;

public class sort0s1s2s {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the elemnts you wnat to store:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in 0's 1's and 2's form :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] a=sortingArray(arr);
        System.out.println("sorted Array of 0's 1's and 2's:"+Arrays.toString(a));
        sc.close();
    }

    public static int[] sortingArray(int[] arr)
    {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count0++;
            }
            else if(arr[i]==1)
            {
                count1++;
            }
            else if(arr[i]==2)
            {
                count2++;
            }
        }

        int i=0;
        while(count0>0)
        {
            arr[i++]=0;
            count0--;
        }

        while(count1>0)
        {
            arr[i++]=1;
            count1--;
        }
        while(count2>0)
        {
            arr[i++]=2;
            count2--;
        }

        return arr;
    }
}
