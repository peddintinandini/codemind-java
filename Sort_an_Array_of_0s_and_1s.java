import java.util.Scanner;
import java.util.Arrays;
class teja
{
    public static void main(String args[])
    {
        int n,x[],i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<x.length;i++)
        x[i]=sc.nextInt();
        Arrays.sort(x);
        for(int ele:x)
        System.out.print(ele+" ");
        sc.close();
    }
}