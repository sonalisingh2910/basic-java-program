// Friendly pair or not (amicable or not) using Java

 public class Friendlypair{

  public static void main(String[] args)
  {
    int num2=30;
    int num1=140;

   int  sum1=sumofdivisor(num1);
   int  sum2=sumofdivisor(num2);

   if(sum1/num1 == sum2/num2)
   {
    System.out.println(num1+"and "+num2+"are friendly pair");

   }
   else{
    System.out.println(num1+"and "+num2+"are not friendly pair");

   }


  }
   static int sumofdivisor(int num)
   {
    int sum=0;
    for(int i=1;i<num;i++)
    {
      if(num % i==0)
      sum=sum+i;
    }
    return sum;
   }

 }