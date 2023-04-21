 class amstrongNumber {
  
     
   
    static int  power(int num){
        int length=0;
        while(num!=0){
           
      length++;
      num=num/10;
   
    }
          return length;
    }
     public static void main(String []args){
      int num=121;
      int temp=num;
      int rev=0;
      int rem=0;
      int  length;
      length=power(num);
      
      while(temp!=0){
       rev=temp%10;
       rem= rem+(int)Math.pow(rev, length);
       temp=temp/10;
      }
      System.out.println(rem);
     }
  }