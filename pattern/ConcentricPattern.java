
import java.util.*;
public class ConcentricPattern {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        int n=sc.nextInt();
        int size=2*n-1;
        int start=0;
        int end=size-1;
        int[][] a=new int[size][size];


      while(n!=0){
        for(int i=start;i<=end;i++)
        {
            for(int j=start;j<=end;j++)
            {
                if(i==start||i==end||j==start||j==end)
                {
                    a[i][j]=n;
                }
            }
        }
        start++;
        end--;
        n--;
    }

    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
       {
        System.out.print(a[i][j]);
       }
       System.out.println();    }

       sc.close();
    }
}
