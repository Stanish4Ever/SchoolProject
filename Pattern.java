public class Pattern
{
    public static void main()
    {
        int i,j,a;       
        System.out.println("\tThe Required Pattern\n");
        for(i=1;i<=5;i++)
        {
            System.out.print("\t     ");
            for(j=5,a=65;j>=i;j--,a++)
            System.out.print((char)a+" ");
            for(j=1,a=65;j<i;j++,a++)
            System.out.print((char)a+" ");
            System.out.println();
        }
    }               
 }
