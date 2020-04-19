import java.io.*;
import java.util.*;
import java.text.*;
public class Shopping_Mall
{
    
    int x;
    String ProductsE1[]={"Xiaomi Redmi Note 5 Pro                      ","One Plus 6 Avengers Limited Edition          ","Asus Rog Strix Laptop                        "};
    int ProductsE[]={45,25,30};
    int PriceE[]={10000,27000,78000};
    String ProductsM1[]={"Reebok Sports Shoe + Watch + Aviator Sunglass","Deadpool Graphics Shirt                      ","Denim Rock Jeans                             "};
    int ProductsM[]={22,7,23};
    int PriceM[]={1700,200,1020};
    String ProductsW1[]={"Olive Fashion Women Black Wedges             ","Clo Clu Full Sleeve Women Denim Jacket       ","Aviator Wayfarer Sunglasses                  "};
    int ProductsW[]={43,23,13};
    int PriceW[]={2200,2300,1020};
    String ProductsB1[]={"H.C. Verma Concepts of Physics Part 1 & 2    ","Parker Galaxy Frontier Fountain Pen          ","Casio FX-82MS Scientific Calculator          "};
    int ProductsB[]={99,16,99};
    int PriceB[]={340,900,120};
    SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
    int Peq[]={0,0,0,0,0,0,0,0,0,0};
    String Cart[]=new String[10];
    int Price[]=new int[10];
    static int cart1=0,size=0,n=0,n1=0,cart=0,y=0,w=0;
    Scanner as = new Scanner(System.in);
    String Name,Address,mop;
    void Menu(int z)
    {
                  System.out.print('\u000C');
          System.out.println("\t----------------------------------------------------------------");   
        System.out.println("\t| ************************* STANISH ZEON ************************* |");  
          
        System.out.println("\t----------------------------------------------------------------");  
            System.out.println("\t"+"\t"+"\t"+"---------------------------------");
        System.out.println("\t"+"\t"+"\t"+"| WELCOME! TO ONLINE SHOPPING! |");
        System.out.println("\t"+"\t"+"\t"+"---------------------------------");
        if(z==0 || z==1)
        System.out.println("\n\t"+"\t"+"\t"+".. SELECT YOUR DESIRED OPTION ..");
        if(z==1)
        {
            System.out.println("        1. ELECTRONICS \t 2.MENSWEAR \t 3.WOMENSWEAR \t 4. BOOKS & STATIONARY\t 5.GO TO CART");
        System.out.println("-------------------------------------------------------------------------------------");
    }
    
    }  
    void addCart(String Pname,int Pquant,int cp)
    {
        for(int i=0;i<Pquant;i++)
        Cart[cart1]=Pname;
        Peq[cart1]=Pquant;
        Price[cart1]=Pquant*cp;
        cart1++;
        size+=Pquant;
    }
 int Electronics(int z1)
    {
        int x1,qt;
        if(ProductsE[z1-1]>0)
        {
          System.out.println("\t\tStock Left:"+ProductsE[z1-1]);
         for(qt=0;;)
         {
         System.out.print("\t\t Enter Quantity:");
         qt=as.nextInt();
         if(qt>0 && qt<=ProductsE[z1-1] && (size+qt)<=10)
         {
            
            addCart(ProductsE1[z1-1],qt,PriceE[z1-1]);
            ProductsE[z1-1]-=qt;
          break;
         }
         if(qt==0)
         break;
         if((size+qt)>10)
         {
         System.out.println("\n\n\t\t CART OVERLOADDED!");
         return(3);
        }
         }
        }
        else
        System.out.println("\t\t\t OUT OF STOCK!");
        System.out.print("\t\t To Go back and Continue Enter 1 else 2:");
        x1=as.nextInt();
        return(x1);
}
    
    int Menswear(int z1)
    {
         int x1,qt;
        if(ProductsE[z1-1]>0)
        {
          System.out.println("\t\tStock Left:"+ProductsM[z1-1]);
         for(qt=0;;)
         {
         System.out.print("\t\t Enter Quantity:");
         qt=as.nextInt();
         if(qt>0 && qt<=ProductsM[z1-1] && (size+qt)<=10)
         {
            
            addCart(ProductsM1[z1-1],qt,PriceM[z1-1]);
            ProductsM[z1-1]-=qt;
          break;
         }
         if(qt==0)
         break;
         if((size+qt)>10)
         System.out.println("\n\n\t\t CART OVERLOADDED!");
           System.out.println("\t\t Please Try Again..");
         }
        }
        else
        System.out.println("\t\t\t OUT OF STOCK!");
        System.out.print("\t\t To Go back and Continue Enter 1 else 2:");
        x1=as.nextInt();
        return(x1);
    }
    int Womenswear(int z1)
    { int x1,qt;
        if(ProductsW[z1-1]>0)
        {
          System.out.println("\t\tStock Left:"+ProductsW[z1-1]);
         for(qt=0;;)
         {
         System.out.print("\t\t Enter Quantity:");
         qt=as.nextInt();
         if(qt>0 && qt<=ProductsW[z1-1] && (size+qt)<=10)
         {
            
            addCart(ProductsW1[z1-1],qt,PriceW[z1-1]);
            ProductsW[z1-1]-=qt;
          break;
         }
         if(qt==0)
         break;
         if((size+qt)>10)
         System.out.println("\n\n\t\t CART OVERLOADDED!");
           System.out.println("\t\t Please Try Again..");
         }
        }
        else
        System.out.println("\t\t\t OUT OF STOCK!");
        System.out.print("\t\t To Go back and Continue Enter 1 else 2:");
        x1=as.nextInt();
        return(x1);
    }
    int Books(int z1)
    {
          int x1,qt;
        if(ProductsE[z1-1]>0)
        {
          System.out.println("\t\tStock Left:"+ProductsB[z1-1]);
         for(qt=0;;)
         {
         System.out.print("\t\t Enter Quantity:");
         qt=as.nextInt();
         if(qt>0 && qt<=ProductsB[z1-1] && (size+qt)<=10)
         {
            
            addCart(ProductsB1[z1-1],qt,PriceB[z1-1]);
            ProductsB[z1-1]-=qt;
          break;
         }
         if(qt==0)
         break;
         if((size+qt)>10)
         System.out.println("\n\n\t\t CART OVERLOADDED!");
           System.out.println("\t\t Please Try Again..");
         }
        }
        else
        System.out.println("\t\t\t OUT OF STOCK!");
        System.out.print("\t\t To Go back and Continue Enter 1 else 2:");
        x1=as.nextInt();
        return(x1);
    }
    void Check()
    {
        for(int i=0;i<cart1;i++)
        {
            for(int j=i+1;j<cart1;j++)
            if(Cart[i].equalsIgnoreCase(Cart[j]))
            {
                Peq[j]=0;
                Cart[j]="";
                Price[i]+=Price[j];
                Price[j]=0;
                Peq[i]++;               
            
            }
        }
    }
    public int Payment(){
    int c1=0,ch2=0,c2=0,c3=0,c4=0,i,j,c0=0;
    long m;
    char ch;
 
    System.out.print("\t\t\t Enter Your Name:");
    Name=as.nextLine();
    System.out.print("\t\t\t Enter Your Full Adress:");
    Address=as.nextLine();
    System.out.print("\t\t\tMODE OF PAYMENT:(CASH or CHEQUE/CARD:)");
    for(; ; ){
        
    mop=as.nextLine();
    if(mop.equalsIgnoreCase("CASH")||mop.equalsIgnoreCase("cheque")||mop.equalsIgnoreCase("card"))
    break;
    System.out.println("\t\t\t\tWRONG INPUT!TRY AGAIN!");
    System.out.print("\t\t\tMODE OF PAYMENT:(CASH or CHEQUE/CARD:)");
}
     if(mop.equalsIgnoreCase("CASH")||mop.equalsIgnoreCase("cheque"))
    return(1);
    System.out.print("\t\t\tENTER YOUR 16 DIGIT CARD NUMBER:"); 
    for(;;){
     Long card=Long.valueOf(as.nextLine());
     Long card2=card;
     while(card2!=0){
         m=card2%10;
         c0++;
         card2/=10;
        }
       
      if(c0==16)  
     break;
     System.out.print("\t\t\tWRONG CARD NUMBER!PLEASE RE-ENTER YOUR CARD NUMBER:");
     c0=0;
    }
    System.out.print("\t\t\tENTER YOUR PASSWORD:");
     for(i=1;i<=3;i++){
      
      String pass=as.nextLine();
      int p=pass.length();
      for(j=0;j<p;j++)
      {
          ch=pass.charAt(j);
          if(ch=='1' || ch=='2' ||ch=='3' ||ch=='4' ||ch=='5' ||ch=='6' ||ch=='7' ||ch=='8' ||ch=='9' ||ch=='0')
          c1=1;
          ch2=(int)ch;
          if((ch2>=65 && ch2<=90))
          c2=1;
          if ((ch2>=97 && ch2<=122))
          c3=1;
        }
        if(c1==1 && c2==1 && c3==1 && (p>=8))
        {c4=1;
            break;
        }
        if(i==3)
        continue;
        System.out.print("\t\t\tWRONG PASSWORD!RE-ENTER YOUR PASSWORD:");
    }
    if(c4==0){
        System.out.println("\n\n\t\tATTEMPTS OVER! SESSION END.");
    return(-1);
}
    else
    return(1);
}
    void Billing()
    {
        int confirm=Payment();
        int Sum=0;
        if(confirm==1)
        {
             System.out.println("\n\n\t\t----------------------------------------------------------------");   
        System.out.println("\t\t| ************************* STANISH ZEON ************************* |");  
          
        System.out.println("\t\t----------------------------------------------------------------");  
            System.out.println("\t"+"\t"+"\t\t"+"     COMPUTERIZED GENERATED BILL\n\n");
                   System.out.println("\t\t\t\t"+ft.format(new Date( )));
        System.out.println("\t\t\tCUSTOMER NAME:"+Name.toUpperCase()+"\n\t"+"\t\t"+"ADDRESS:"+Address.toUpperCase());
      
        System.out.println("\t\t\tMODE OF PAYMENT:"+mop.toUpperCase());
              System.out.println("----------------------------------------------------------------------------------------------------");
              System.out.println("Sr. No. | "+" Product Name                                  |"+" Quantity |"+" Net Price(Rs) " );
              System.out.println("----------------------------------------------------------------------------------------------------");
        for(int i=0;i<cart1;i++)
        if(Cart[i].equalsIgnoreCase("")==false)
       {
              System.out.println("   "+(i+1)+"    | "+Cart[i]+"  |  "+ Peq[i]+"      |" +"   "+Price[i] );
        Sum+=Price[i];
        }
                System.out.println("\n----------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t   TOTAL AMOUNT: RS "+Sum);
            System.out.println("\t"+"\t"+"\t\tTHANK YOU 4 SHOPPING!VISIT AGAIN");
        System.out.println("\t\t\t\t DELIVERY WITHIN 10 DAYS");
        
        
        System.out.println("\tNOTE:PLEASE SHOW THE COMPUTERIZED GENERATED RECEIPT WHEN PRODUCT DELIVERS!");
        
        System.out.print("\n\tPRESS ENTER TO CONTINUE...");
        String enter=as.nextLine();
        cart1=0;size=0;n=0;n1=0;cart=0;y=0;w=0;
        int Peq[]={0,0,0,0,0,0,0,0,0,0};
        }
       
    }
    void GoToCart()
    {   Check();
        Menu(3);
        System.out.println("\n\t\t----------------------------------YOUR CART----------------------------------\n");
        if(cart1==0)
        {
            System.out.println("\t\tCART IS EMPTY!!!");
            System.out.print("\t\tPRESS 'ENTER' 2 Times to Continue..");
        String l=as.nextLine();
        return;
        }
       System.out.println("\t\t----------------------------------------------------------------------------------------------------");
            System.out.println("\t\tSr. No. | "+" Product Name                                  |"+" Quantity |"+" Net Price(Rs) " );
                   System.out.println("\t\t----------------------------------------------------------------------------------------------------");
            for(int i=0;i<cart1;i++)
        if(Cart[i].equalsIgnoreCase("")==false)
        System.out.println("\t\t   "+(i+1)+"    | "+Cart[i]+"  |  "+ Peq[i]+"      |" +"   "+Price[i] );
                System.out.println("\n\t\t----------------------------------------------------------------------------------------------------");
     System.out.print("\t\tPRESS '1' to Proceed to Checkout else press 'ENTER' to go back to Main Menu:");
        String l=as.nextLine();
        if(l.equalsIgnoreCase("1"))
        Billing();
        
    }
    public static void main(String args[])
    {  
        int n,n1=0,cart=0,y=0,w=0;
        Shopping_Mall ax=new Shopping_Mall();
        Scanner as = new Scanner(System.in);
        while(1==1)
       {
           
            ax.Menu(1);      
        for(n=0;;)
        {
        System.out.print("\n\t\t\t    Enter option Number:");
         n=as.nextInt();
         if(n>=1 && n<=5)
         break;
         ax.Menu(1);
         System.out.println("\t\t\t   Wrong Option..Try again.!");
        }
        if(n==5)
        ax.GoToCart();
        switch(n)
        {
            case 1:
                for(n1=0;;)
        {   
            ax.Menu(0);
             System.out.println("        1. Xiaomi Redmi Note 5 Pro \t 2.One Plus 6 Avengers Limited Edition \t 3.Asus Rog Strix Laptop 4.BACK 5.GO TO CART");
            System.out.println("\t\t Rs 10,000 \t\t Rs 27,000 \t\t\t\t Rs 78,000");
             System.out.println("------------------------------------------------------------------------------------------------------------------");
         
        System.out.print("\n\t\t\t    Enter option Number:");
         n1=as.nextInt();
         
        
            if(n1>=1 && n1<4)
            y=ax.Electronics(n1);            
            if(y==1)
            {
                y=0;
               continue;
            }
            if(n1==5)
            ax.GoToCart();
            
            if(n1>=1 && n1<=5)
            break;
          ax.Menu(0);
         System.out.println("\t\t\t   Wrong Option..Try again.!");
         
        }
        break;
        case 2:
              for(n1=0;;)
        {
             ax.Menu(0);
             System.out.println("        1. Reebok Sports Shoe + Watch + Aviator Sunglass \t 2.Deadpool Graphics Shirt   \t 3. Denim Rock Jeans 4.BACK 5.GO TO CART");
             System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("\t\t Rs 1,700 \t\t\t\t\t Rs 200 \t\t\t\t Rs 1,020");
        System.out.print("\n\t\t\t    Enter option Number:");
         n1=as.nextInt();
           if(n1>=1 && n1<4)
            y=ax.Menswear(n1);            
           if(y==1)
            {
                y=0;
               continue;
            }
            if(n1==5)
            ax.GoToCart();
            
            if(n1>=1 && n1<=5)
            break;
          ax.Menu(0);
         System.out.println("\t\t\t   Wrong Option..Try again.!");
        }
        break;
        
        case 3:
                for(n1=0;;)
        {
            ax.Menu(0);
             System.out.println("        1.Olive Fashion Women Black Wedges \t 2. Clo Clu Full Sleeve Women Denim Jacket \t 3.Aviator Wayfarer Sunglasses 4.BACK 5.GO TO CART");
             System.out.println("-------------------------------------------------------------------------------------");
             System.out.println("\t\t Rs 2,000 \t\t\t Rs 2,300 \t\t\t\t\t Rs 1,020");
        System.out.print("\n\t\t\t    Enter option Number:");
         n1=as.nextInt();
        if(n1>=1 && n1<4)
            y=ax.Womenswear(n1);            
            if(y==1)
            {
                y=0;
               continue;
            }
            if(n1==5)
            ax.GoToCart();
            
            if(n1>=1 && n1<=5 || y==3)
            break;
            ax.Menu(0);
         System.out.println("\t\t\t   Wrong Option..Try again.!");
        }
            break;
            case 4:
                  for(n1=0;;)
             {
             ax.Menu(0);
             System.out.println("        1.H.C Verma Physics Part 1 & 2 \t 2. Parker Galaxy Frontier Fountain Pen \t 3. Casio FX-82MS Calculator \t 4.BACK 5.GO TO CART");
             System.out.println("------------------------------------------------------------------------------------------------------");
             System.out.println("\t\t Rs 340 \t\t\t\t Rs 900 \t\t\t\t Rs 120");
        System.out.print("\n\t\t\t    Enter option Number:");
         n1=as.nextInt();
            if(n1>=1 && n1<4)
            y=ax.Books(n1);            
             if(y==1)
            {
                y=0;
               continue;
            }
            if(n1==5)
            ax.GoToCart();
            
            if(n1>=1 && n1<=5)
             break;
             ax.Menu(0);
            System.out.println("\t\t\t   Wrong Option..Try again.!");
        }
             break;
        case 5:
        ax.GoToCart();
    } 
    if(n1==4)
    continue;
    if(n1==5)
    ax.GoToCart();
    System.out.println("PRESS ENTER TO CONTINUE");
    String enter=as.nextLine();
    
}
}
}
