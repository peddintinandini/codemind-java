import java.util.Scanner;
class teja
{
    public  static void main(String args[])
    {
        int n,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    temp=n*n;
    while(temp!=0)
    {
        r=temp%10;
        
        sum=sum+r;
        temp=temp/10;
    }
    if(n==sum)
    System.out.println("Neon Number");
    else
    System.out.println("Not Neon Number");
    }
}