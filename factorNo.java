// Factors of a number using Java

public class factorNo {

    public static void main(String[] args)
    {
        int n=10;
        System.out.println("factor of " + n + "is");

        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                System.out.println(""+i);
            }
        }
    }
    
}
