import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,q,e=1,o=1;
        n=sc.nextInt();
        while(n>9)
        {
            q=n;
            while(q>0)
            {
            r=q%10;
            if(r%2==0)
            {
            e=0;
            }
            else
            {
            o=0;
            }
            q=q/10;
            }
          if(e==0&&o!=0)
          {
            System.out.println("Even");
            break;
          }
           else if(e==0&&o==0)
          {
            System.out.println("Mixed");
            break;
           }
           else
          {
            System.out.println("Odd");
            break;
           }
        }
        if(n<10&&n>0) 
        {
             if(n%2==0)
             {
               System.out.println("Even");
             }
              else
              {
                System.out.println("Odd");
              }
               
         }
        
    }
}