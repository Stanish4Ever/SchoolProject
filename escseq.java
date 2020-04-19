
import java.util.*;
public class escseq
{
    public static void Stanish()
    {
        int a[]=new int[7];
        Scanner as=new Scanner(System.in);
       int i,j,k,m,f;
        int l=a.length;
        
    
       
        for(i=0;i<(l-1);i++)
        {
            k=i;
            for(j=i+1;j<l;j++)
            if(a[j]<a[k])
            k=j;
            m=a[i];
            a[i]=a[k];
            a[k]=m;
            System.out.println("Seq:"+i+1);
            for(f=0;f<l;f++)
        System.out.println(a[f]);
    }
    for(i=0;i<l;i++)
        System.out.println(a[i]);
        System.out.print('\u000C');
        System.out.println((-25%6)+" 2."+(-22/5)+"3."+((4.5+0.5)*3.0) +"4."+(4.5+3.2*2.5));
        int x=35;
        char c='X';
        System.out.println(Math.sqrt(x++));
        int y=24;
        int n=(++c)/(--y);
        System.out.println(n);
        System.out.println((int)++c);
    }
}