import java.util.Scanner;
class nandu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        double n=sc.nextInt();
        double m=sc.nextInt();
        double o=sc.nextInt();
        double c=n*(Math.pow((1+m/100),o));
        System.out.printf("%.2f",c);
        
    }

}