import java.util.*;
public class Books_Stationary
{
    public static void main()
    {
        Scanner as =new Scanner(System.in);
        String s[];
        int i;
        String Books[]={"Physics H.C Verma Part 1","Physics H.C Verma Part 2","Safe Haven by Nicholas Sparks","A Walk to Remember by Nicholas Sparks","Theory of Everything by Stephen Hawkings","Brief History of Time by Stephen Hawkings","Doomsday Conspiracy by Sidney Sheldon","If Tomorrow Comes by Sidney Sheldon","Looking for Alaska by John Green","The Fault in our Stars by John Green"} ;
        int bprice[]={262,289,214,215,98,135,225,230,231,250};
        String Stationary[]={"Apsara Erazer","Classmate 6 in 1 Notebook","Doms Pencil","Doms Sharpener","Parker Blue Pen","Parker Black Fountain Pen","Camlin Crayon","Color Pallet","Pencil Bag","Camlin Oil Pastels"};
        int sprice[]={5,145,4,4,445,720,60,150,73,370};
        int qt[]=new int[10];
        System.out.println("Menu:- \n\n 1.Stationary \n 2.Books");
        int n=as.nextInt();
        if(n==1)
       for(i=0;i<10;i++)
        System.out.println((i+1)+Books[i]);    
        else        
        for(i=0;i<10;i++)
        System.out.println((i+1)+Stationary[i]);
    }
        
}
