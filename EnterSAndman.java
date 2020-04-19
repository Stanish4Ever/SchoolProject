public class EnterSAndman
{
    public static void main(String s)
    {
        int i,l,k=0;
        l=s.length();
        for(i=l;i>=0;i--)
        {
            for(k=5;k>i;k--)
            System.out.print(' ');
            System.out.print(s.substring(0,i));
            System.out.println();
        }
    }            
}
