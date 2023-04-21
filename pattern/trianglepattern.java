public class trianglepattern {
    public static void main(String[] args)
    {
      // pattern1(5);
       pattern2(5);
    }

    public static void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print(i);
          }
          System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for(int i=5;i>=1;i--)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print(j);
          }
          System.out.println();
        }
    }
    
}
