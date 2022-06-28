import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,d;
    n=sc.nextInt();
    sq=n*n;
    d=(int)Math.log10(n)+1;
    if(n==sq%(int)Math.pow(10,d))
    System.out.println("Automorphic Number");
    else
    System.out.println("Not an Automorphic Number");
    
    }
}