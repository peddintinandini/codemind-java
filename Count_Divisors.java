import java.util.Scanner;
class nandu
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nandu na=new nandu();
        int n,m,i,o,c1=0;
        n=sc.nextInt();
        m=sc.nextInt();
        o=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(i%o==0)
            {
            
             c1+=1;
            }
        }
         System.out.println(c1);
        
        
    }

}