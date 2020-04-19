import java.io.*;
import java.util.*;
import java.text.*;
public class OnlineAdmissionSoftware
{
    SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
    int s;
    static int seats1=25,seats2=15,seats3=10;
    String mop="";
    BufferedReader as=new BufferedReader(new InputStreamReader(System.in));    
    public int Science(int agg1,int maths,int Science,int comp)
    {
        s=0;
        if(seats1==0)
        return(-1);
        if(agg1>=75){         
        if((maths>=80)&&(Science>=75)&&(comp>=80))
        s=1;
        if((maths>=80)&&(Science>=75)&&(comp<80))
        s=2;
    }
    return(s);
}
public int Commerce(int agg1,int maths,int comp){
    s=0;
    if(seats2==0)
        return(-1);
    if(agg1>=70){
        if((maths>=70)&&(comp>=70))
        s=1;
        if((maths>=70)&&(comp<70))
        s=2;
    }
    
    return(s);
}
public int Economics(int agg1,int english,int sst){
    s=0;
    if(seats3==0)
        return(-1);
    if(agg1>=65){
        if((english>=80)&&(sst>=60))
        s=1;
        
    }
    
    return(s);
}
public int Payment()throws IOException{
    int c1=0,ch2=0,c2=0,c3=0,c4=0,i,j,c0=0;
    long m;
    char ch;
    System.out.print("\t\t\tMODE OF PAYMENT:(CASH or CHEQUE/CARD:)");
    for(; ; ){
        
    mop=as.readLine();
    if(mop.equalsIgnoreCase("CASH")||mop.equalsIgnoreCase("cheque")||mop.equalsIgnoreCase("card"))
    break;
    System.out.println("\t\t\t\tWRONG INPUT!TRY AGAIN!");
    System.out.print("\t\t\tMODE OF PAYMENT:(CASH or CHEQUE/CARD:)");
}
     if(mop.equalsIgnoreCase("CASH")||mop.equalsIgnoreCase("cheque"))
    return(1);
    System.out.print("\t\t\tENTER YOUR 16 DIGIT CARD NUMBER:"); 
    for(;;){
     Long card=Long.valueOf(as.readLine());
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
      
      String pass=as.readLine();
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
        System.out.println("\n\n\t\tATTEMPTS OVER!");
    return(-1);
}
    else
    return(1);
}
    void receipt(int sub,int fees,String name,int fu,int Dateday,int Datemonth){
        String Sub="";
        if(sub==1 && fu==1)
        Sub="\tScience(with Computer)";
        if(sub==1 && fu==2)
        Sub="\tScience(with Bio)";
        if(sub==2 && fu==1)
        Sub="\tCommerce(with Comp)";
        if(sub==2 && fu==2)
        Sub="\tCommerce(without Comp)";
        if(sub==3)
        Sub="\tHumanities";
        System.out.println();
        
              
        System.out.println("\t----------------------------------------------------------------");   
        System.out.println("\t| ****************STANISH ENGLISH MEDIUM SCHOOL**************** |");  
        System.out.println("\t| *********Eastern Tower,64 Barrack Road,Barrackpore*********** |");  
        System.out.println("\t----------------------------------------------------------------");  
   
        System.out.println("\t\t\t"+ft.format(new Date( )));
        System.out.println("\tCANDIDATE:"+name.toUpperCase()+"\t"+"\t"+"STREAM:"+Sub.toUpperCase());
        System.out.println("\tAMOUNT:Rs "+fees);
        System.out.println("\tMODE OF PAYMENT:"+mop.toUpperCase());
        System.out.println("\t"+"\t"+"\tCLASES WILL START FROM 16.04.2017!");
        
        System.out.println("\t"+"\t"+"\t"+"\tTHANK U!");
        System.out.println();
        
        
        System.out.println("\tNOTE:PLEASE SHOW THE RECEIPT IN THE OFFICE ON OR BEFORE 16.04.2017!");
        
        if(sub==1)
        seats1--;
        if(sub==2)
        seats2--;
        if(sub==3)
        seats3--;
    }    
    int checker()throws IOException{
        int marks;
        for(;;)
        {
            marks=Integer.valueOf(as.readLine());
        if(marks>=0&&marks<=100)
        return(marks);
        System.out.print("\t\t\tWRONG INPUT!PLEASE ENTER YOUR MARKS AGAIN:");
    }
}

public static void main(String args[])throws IOException
{
      BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
    int m=1,x=0,n=0; String nam="";
     OnlineAdmissionSoftware as1=new OnlineAdmissionSoftware();
    for(;;)
    {
        
    int agr=0,Maths=0,science=0,computer=0,f=0,eng=0,st=0,k1=0,fee=0,o=0,dateday=0,datemonth=0;
    int q=0;
    String check="";
    if(x!=1){
        System.out.print('\u000C');
        System.out.println("\t----------------------------------------------------------------");   
        System.out.println("\t| ***************STANISH ENGLISH MEDIUM SCHOOL***************** |");  
        System.out.println("\t| *********Eastern Tower,64 Barrack Road,Barrackpore*********** |");  
        System.out.println("\t----------------------------------------------------------------");  
   
        System.out.println("\t"+"\t"+"\t"+"---------------------------------");
        System.out.println("\t"+"\t"+"\t"+"| WELCOME!FOR ONLINE ADMISSION! |");
        System.out.println("\t"+"\t"+"\t"+"---------------------------------");
   System.out.println();
       
    System.out.print("\t\t\t\tENTER YOUR NAME:");
    nam=as.readLine();
    System.out.println();
    System.out.println("\t\t\t\tMENU:-");
    System.out.println();
    System.out.print("\t\t\t\t1. for Science Stream \n\t\t\t\t2. for Commerce Stream and \n\t\t\t\t3. For Humanities Stream \n\t\t\t\t4. To Exit \n\t\t\t\tENTER YOUR CHOICE: ");
    n=Integer.valueOf(as.readLine());
    if(n==4){
        System.out.println();
        System.out.println("\t***********************THANK YOU!VISIT AGAIN************************");
        break;
    }
    System.out.println();
    if((seats1==0 && n==1) || (seats2==0 && n==2) || (seats3==0 && n==3))
    {
        System.out.println("\t\t\t\tSEATS UNAVAILABLE!SORRY FOR THE INCONVENIENCE.");
        System.out.print("\t\t\t\tDO YOU WANT TO TRY FOR OTHER STREAM(YES/NO):");
         check=as.readLine();
        if(check.equalsIgnoreCase("YES")==true)
        {
            System.out.println();
            System.out.println("\t\t\t\tSELECT YOUR CHOICE:-");
            System.out.print("\t\t\t\t1. for Science Stream \n\t\t\t\t2. for Commerce and \n\t\t\t\t3. For Humanities \n\t\t\t\t4. To Exit \n\t\t\t\tENTER YOUR CHOICE: ");
    n=Integer.valueOf(as.readLine());
}
      else
      continue;
       
    }
}

    switch(n)
    {
       
        case 1:
        System.out.println("\t\t\t\tFOR SCIENCE:-");
        System.out.println("\t\t\t\tSEATS AVAILABLE:"+seats1);
        System.out.println();
        System.out.print("\t\t\t\tENTER YOUR AGGREGATE(%):");
        agr=as1.checker();
        System.out.print("\t\t\t\tENTER YOUR SCIENCE MARKS(%):");
        science=as1.checker();
        System.out.print("\t\t\t\tENTER YOUR COMPUTER MARKS(%):");
        computer=as1.checker();        
        System.out.print("\t\t\t\tENTER YOUR MATHEMATICS MARKS(%):");
        Maths=as1.checker();        
        q=1;
       break;       
       case 2:System.out.println("\t\t\t\tFOR COMMERCE:-");
       System.out.println("\t\t\t\tSEATS:"+seats2); 
       System.out.println();
       System.out.print("\t\t\t\tENTER YOUR AGGREGATE(%):");
        agr=as1.checker();       
        System.out.print("\t\t\t\tENTER YOUR COMPUTER MARKS(%):");
        computer=as1.checker();       
        System.out.print("\t\t\t\tENTER YOUR MATHEMATICS MARKS(%):");
        Maths=as1.checker();       
        q=2;
        break;
        case 3:System.out.println("\t\t\t\tFOR HUMANITIES:-");
        System.out.println("\t\t\t\tSEATS AVAILABLE:"+seats3); 
       System.out.println();
       System.out.print("\t\t\t\tENTER YOUR AGGREGATE(%):");
        agr=as1.checker();       
        System.out.print("\t\t\t\tENTER YOUR ENGLISH MARKS(%):");
        eng=as1.checker();        
        System.out.print("\t\t\t\tENTER YOUR SOCIAL SCIENCE MARKS(%):");
        st=as1.checker();        
        q=3;
        break;
        default:
         System.out.println("\t\t\t\tWRONG INPUT!TRY AGAIN PLEASE.");
    }
   
    if(q==1)
    {
         f=as1.Science(agr,Maths,science,computer);
        if(f==1){
        System.out.println("\t\t\tYOU ARE ELLIGIBLE!RECOMMENDED SUBJECT:COMPUTER");       
        fee=15000; String Subchoice;
        for(int a=0;;)
        {System.out.print("\tDO YOU WANT TO CONTINUE WITH COMPUTER OR BIOLOGY?(COMPUTER/BIOLOGY):");
               Subchoice=as.readLine();
                 if(Subchoice.equalsIgnoreCase("biology")==true ||Subchoice.equalsIgnoreCase("Computer")==true )
                 break;
                 System.out.println("\t\t\t\tWrong Choice!Try Again.");
                }
        if(Subchoice.equalsIgnoreCase("biology")==true)
        f=2;            
    }
        if(f==2){
        System.out.println("\t\t\tYOU ARE ELLIGIBLE!RECOMMENDED SUBJECT:BIOLOGY");
        fee=12000;}
    }
    
    if(q==2)
    {
         f=as1.Commerce(agr,Maths,computer);
        if(f==1)
        {
            System.out.println("\t\t\tYOU ARE ELLIGIBLE!RECOMMENDED SUBJECT:COMPUTER");
            fee=12000;
            System.out.print("\t\t\tDO YOU WANT TO CONTINUE WITH COMPUTER?(YES/NO):");
        String Subchoice=as.readLine();
        if(Subchoice.equalsIgnoreCase("NO")==true)
        f=2;          
        }
        if(f==2){
        System.out.println("\t\t\tYOU ARE ELLIGIBLE!SUBJECT COMPUTER IS NOT RECOMMENDED.");        
        fee=10000;
    }    
}
    if(q==3)
    {
         f=as1.Economics(agr,eng,st);
        if(f==1)
        {
        System.out.println("\t\t\t\tYOU ARE ELLIGIBLE!");         
        fee=10000; 
    }
    }
    if(f==0 && (n==1||n==2||n==3)){
        System.out.println("\t\t\t\tSORRY..YOU ARE NOT ELLIGIBLE...");
        if(n<=3){
        
        if(n==1){
        System.out.print("\t\t\t\tDO YOU WANT TO TRY FOR COMMERCE(YES/NO):");
        check=as.readLine();
        
    }
        if(n==2 ||check.equalsIgnoreCase("no")){
        System.out.print("\t\t\t\tDO YOU WANT TO TRY FOR HUMANITIES(YES/NO):");
        check=as.readLine();
        if(n==1)
        o=1;
}
        if(check.equalsIgnoreCase("YES")==true)
        {x=1; 
            n++;
            if(o==1)
            n++;
            System.out.println();
            continue;            
        }
       else 
        {
            x=0;
            continue;
        }
    }        
    }
    if(f!=0){
        System.out.print("\t\t\tDO YOU WANT TO ENTER PAYMENT PORTION(YES/NO):");
        String confirm=as.readLine();
        System.out.println();
         if(confirm.equalsIgnoreCase("Yes"))
        k1=as1.Payment();
       x=0;
}
if(k1==1)   
as1.receipt(n,fee,nam,f,dateday,datemonth);
System.out.print("\n\t");
for(int j=0;j<=70;j++)
System.out.print("*");

System.out.print("\n\tPRESS ENTER TO CONTINUE...Or Type NO to Switch Off the PROGRAM: ");
String enter=as.readLine();
if(enter.equalsIgnoreCase("NO"))
break;
else 
continue;
}
}
}   
      

