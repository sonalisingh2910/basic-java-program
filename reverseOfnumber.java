public class reverseOfnumber {
    public static void main(String[] args)
    {
        int n=657;
        int rev=0;
        int temp;
        while(n!=0)
        {
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println("reverse of number is :"+rev);
    }
}
