import java.util.*;
public class tata {
     
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0,temp=0;
      
      
        for (int i = 0; i < n; i ++)
        {
            temp=0;
            for (int j = i; j < n; j ++)
            {
              
                temp+=arr[j];
                result += temp ;
            }
        }
        return result ;
    }
     

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       String ss=sc.next();
 
       int num=Integer.parseInt(ss);  
  int arr[]=new int[ss.length()];
int i=0;
   while(num!=0){
arr[i]=num%10;
num=num/10;
i++;
}
        int n = arr.length;
        for(i=0;i<n;i++)
 System.out.println(arr[i]);

        System.out.println(SubArraySum(arr, n));
    }
}