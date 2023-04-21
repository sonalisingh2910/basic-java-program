public class fibonacii {

    public static void main(String[] args)
     {
    //     int num=12;
    //     for(int i=0;i<num;i++)

    //     System.out.println(fib(i)+"");
    // }
    

    // static int fib(int num)
    // {
    //    if(num<2)
    //    { 
    //    return num;
    //    }

    // return fib(num-1)+fib(num-2);
    // }

    int a=0,b=1,c;
    int n=10;
    System.out.print(a+"   "+b);
   
    for(int i=0;i<n;i++)
    {
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
    }
    }
}
