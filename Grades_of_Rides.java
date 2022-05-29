import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int h,sp,sf;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        sp=sc.nextInt();
        sf=sc.nextInt();
        if(h>50&&sp>60&&sf>100)
        System.out.println("10");
        else if(h>50&&sp>60)
         System.out.println("9");
         else if(sp>60&&sf>100)
          System.out.println("8");
          else if(h>50&&sf>100)
           System.out.println("7");
           else if(h>50||sp>60||sf>100)
            System.out.println("6");
            else
             System.out.println("5");
    }
}