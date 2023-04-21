import java.util.*;
public class kthlargestinarray {

    public static int kthlargest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++)
        {
            if(pq.peek()<arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
   }

   public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.println("Array: " + Arrays.toString(arr));
        int n1=kthlargest(arr,k);
        System.out.println("Kth largest element: "+n1);
   }
}
