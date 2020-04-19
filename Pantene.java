public class Pantene
{
    public static void main(int n){
        int i,j,k=1,p=1,m=1;
        for(i=1;i<=n;i++)
        {
            for(j=n-1;j>=i;j--)
            System.out.print(' ');
            for(j=1;j<=k;j++){
                if(p>9)
                p=1;
                System.out.print(p++);
            }
            k+=2;
            System.out.println();
        }
    }
}
