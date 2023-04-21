import java.util.*;
public class stringpalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp=s;
        String rev="";

        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);

        }
        if(temp.equals(rev)){
            System.out.println("String is palindrome:"+temp);

        }
        else
        {
            System.out.println("String is not palindrome:"+temp);
        }
 sc.close();
    }
}
