import java.util.*;
public class FirstTime2D
{
       public static void Stanish()
        {
            System.out.println("Stanish executed at 1st!\n\n");
            main();
                } 
    public static void main()
    {
        int orig[][]=new int[5][5];
        int Mutated[][]=new int[5][5];
        Scanner as=new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter The Numbers into 5x5 Array!");
        for(i=0,k=1;i<5;i++)
        for(j=0;j<5;j++)
        {
            System.out.print(k+".Enter the Number: ");
            orig[i][j]=as.nextInt();
            k++;
        }
        System.out.println("The Array :");
        for(i=0;i<5;i++)
        {
        for(j=0;j<5;j++)
         System.out.print(orig[i][j]+"  ");
         System.out.println();
        }
        
        for(i=0;i<5;i++)
        for(j=0;j<5;j++)
        Mutated[j][i]= orig[i][j];
         System.out.println("The Transposed Array :");
        for(i=0;i<5;i++)
        {
        for(j=0;j<5;j++)
         System.out.print(Mutated[i][j]+"  ");
         System.out.println();
         }
         System.out.println("The Right Diagonal of the Transposed Array!:");
         for(i=0,k=0;i<5;i++,k++){
         for(j=0;j<5;j++)
         if(j==k)
         System.out.print(Mutated[i][k]+"  ");
         else
         System.out.print("   ");
         System.out.println();
        }
        }
                      
        
            }
