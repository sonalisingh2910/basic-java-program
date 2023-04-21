public class primefactor {
    public static void main(String[] args)
    {
      int n=90;
        for(int div=2;div<=n;div++)
       {
            while(n % div==0)
            {
                n=n/div;
                System.out.println(div+"");
                
            }
          
        }
    }
}
