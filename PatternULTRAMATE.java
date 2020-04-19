public class PatternULTRAMATE
{
    public static void Stanish()
    
    {
        int i,j,k;
        {
            for(i=1;i<=4;i++)
            {
                for(j=i;j<=4;j++)
                System.out.print(' ');
                for(k=1;k<=i;k++)
                System.out.print(k);
                for(k=i;k>1;)
                System.out.print(--k);
                System.out.println();
            }
            for(i=3;i>=1;i--)
            {
                for(j=4;j>=i;j--)
                System.out.print(' ');
                for(k=1;k<=i;k++)
                System.out.print(k);
                for(k=i-1;k>=1;k--)
                System.out.print(k);
                System.out.println();
            }
        }
    }

}
