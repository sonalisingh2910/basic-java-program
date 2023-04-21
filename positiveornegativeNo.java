import java.util.*;
public class  positiveornegativeNo
{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a nuber");
        int n=sc.nextInt();
      print(n);
      sc.close();

}
public static  void print(int n){
    
    if(n>0)
    {
      System.out.println("positive");
    }
    else if(n<0)
        {
            System.out.println("negative");
        }

    else if(n==0)
    {
        System.out.println("Zero");
    }
//     else
// {
//     System.out.println("Not a number");
// }
          
    }
 
}


// class HelloWorld {
//   public static  int print(int arr[]){
//         int k=0;
//         for(int i=0;i<arr.length-1;i++){  
//             if(arr[i]==arr[i+1]){
//                  k++;
//             }
//         }
//        return k;
//     }
//     public static void main(String[]args){
//      int arr[]={1,1,2};
    
//     int incrementvalue = print(arr);
// System.out.println(incrementvalue+"");
     
//     }
// }

// shruti doubt//
//  class DplicateElement {
   
//     public static  int print(int arr[])
//     {
//         int k=0;
//         for(int i=0;i<arr.length-1;i++)
//         {  
//             if(arr[i]==arr[i+1]){
//                  k++;
//             }
//         }
//        return arr.length-k;
//     }
//     public static void main(String[] args)
//     {
//      int arr[]={1,1,2};
    
//     int incrementvalue = print(arr);
//      System.out.println(incrementvalue);

// }}