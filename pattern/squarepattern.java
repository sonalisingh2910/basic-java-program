public class squarepattern
{
    public static void main(String[]  args)
    {
        pattern1(5);
       // pattern2(5);
       //pattern3(5);
      // pattern4(5);
    }

    public static void pattern1(int n)
    {
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    
    public static void pattern2(int n)
    {
        
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
                //if(rows==(n/2)+1||col==(n/2)+1)for odss
                if(rows==3||col==3)
                System.out.print("*");
                else
                System.out.print("0");
            }

            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
                if(rows==col||rows+col==n+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    
    public static void pattern4(int n)
    {
        
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n;col++)
            {
                if(rows==1||col==1||rows==n||col==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}