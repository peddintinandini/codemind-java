import java.util.Scanner;
class nandu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float r;
        n=sc.nextInt();
        r=(float)((n-32)*5)/9;
        System.out.printf("%.2f",r);
    }

}