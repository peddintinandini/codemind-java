import java.util.Scanner;
class Sample
{
  public static int 
  sumofProperDivisors(int x)
    {
        int sum=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int p=Sample.sumofProperDivisors(m);
        int q=Sample.sumofProperDivisors(n);
        if(m==q&&n==p)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
}