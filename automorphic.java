class sumofnumber{
    public static void main(String[] args)
    {
        int n=153;
        int len;
        int rev=0;
        int sum=0;
        len=order(n);
        int temp=n;
        while(n!=0){
            rev=n%10;
            sum=sum+(int)Math.pow(rev,len);
            n=n/10;

        }
        if(temp==sum)
        {
        System.out.println("armstrong" + temp);
        }
        else{
            System.out.println("not armstrong"+ temp);
        }
    }
    static int  order(int n)
    {
        
    int len=0;
    while(n!=0){
        len++;
        n=n/10;
    }
    return len;
    }
}