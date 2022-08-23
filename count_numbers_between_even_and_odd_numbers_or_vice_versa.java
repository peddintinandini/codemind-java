import java.util.Scanner;

class jagan
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0,s=0,rep;
        for(i=1;i<n-1;i++)
        {
           if(arr[i-1]%2==0 &&  arr[i+1]%2!=0)
           {
               c=c+1;
           }
           if(arr[i-1]%2!=0 && arr[i+1]%2==0)
           {
               c=c+1;
           }
        }
        System.out.printf("%d",c);
    }
}