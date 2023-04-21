public class instancevariable {
    
    int x;
    double d;
    boolean b;
    String s;


    public static void main(String[] args)
    {
    
       // System.out.println(x); CE: non-static variable cannot be refference from static context
    //    instancevariable i=new instancevariable();
    //     System.out.println(i.x);
        
         instancevariable i=new instancevariable();
         System.out.println(i.x);
         System.out.println(i.d);
         System.out.println(i.b);
         System.out.println(i.s);



    }

    // public void m1()
    // {
    //     System.out.println(x);
    // }
}
