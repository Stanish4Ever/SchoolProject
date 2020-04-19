    import java.util.*;
import java.io.*;
public class SFOA1
{
    int s;
    static int seats1=25,seats2=15,seats3=10;
    String mop="";
    BufferedReader as=new BufferedReader(new InputStreamReader(System.in));    
    public int Science(int agg1,int maths,int Science,int comp)
    {
        int s=0;
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

    public int Payment(String commitment)throws IOException{
        int c1=0,ch2=0,c2=0,c3=0,c4=0,i,j,c0=0;
        long m;
        char ch;  
        for(; ;){
            System.out.println("MODE OF PAYMENT:(CASH or CHEQUE/CARD:)");
            mop=as.readLine();
            if(mop.equalsIgnoreCase("CASH")||mop.equalsIgnoreCase("cheque"))
                return(1);
            if(mop.equalsIgnoreCase("CARD")){

                System.out.println("Enter ur 16 DIGIT Card Number:"); 
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
                    System.out.println("Wrong!Pls Re-enter ur Card Number:");
                    c0=0;
                }
                System.out.println("Enter ur Password:");
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
                    System.out.println("Wrong Pass!Renter ur Password:");
                }
                if(c4==0)
                    return(-1);
                else
                    return(1);
            }
            else{
                System.out.println("WRONG OPTION!");
                continue;
            }
        }
    }

    void receipt(int sub,int fees,String name,int fu){
        String Sub="";
        if(sub==1 && fu==1)
            Sub="Science(with Computer)";
        if(sub==1 && fu==2)
            Sub="Science(with Bio)";
        if(sub==2 && fu==1)
            Sub="Commerce(with Comp)";
        if(sub==2 && fu==2)
            Sub="Commerce(without Comp)";
        if(sub==3)
            Sub="Humanities";
        Calendar c=Calendar.getInstance();
        System.out.println("***************SUMIT NATIONAL HIGH SCHOOL******************");
        System.out.println("    61 Shyampore Road,Litti Lane,Johar Khan,Kharda ");
        System.out.println("\t"+"\t"+"   DATE:"+c.get(Calendar.DATE)+"."+c.get(Calendar.MONTH)+"."+c.get(Calendar.YEAR)+".");
        System.out.println("CANDIDATE:"+name.toUpperCase()+"\t"+"\t"+"STREAM:"+Sub.toUpperCase());
        System.out.println("AMOUNT:Rs "+fees);
        System.out.println("MODE OF PAYMENT:"+mop.toUpperCase());
        System.out.println("\t"+"\t"+"CLASES WILL START FROM 10.05.2017!");        
        System.out.println("\t"+"\t"+"\t"+"THANK U!");
        System.out.println();       
        System.out.println("NOTE:PLEASE SHOW THE RECEIPT IN THE OFFICE ON OR BEFORE 10.05.2017!");
        if(sub==1)
            seats1--;
        if(sub==2)
            seats2--;
        if(sub==3)
            seats3--;
    }    

    public static void main()throws IOException
    {
        int m=1,x=0,n=0; String nam="";
        while(m!=0){         
            BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
            int agr=0,Maths=0,science=0,computer=0,f=0,eng=0,st=0,k1=0,fee=0;
            int q=0;
            String check="";
            if(x!=1){
                System.out.println("*****************SUMIT NATIONAL HIGH SCHOOL*******************");   
                System.out.println("\t"+"\t"+"WELCOME!FOR ONLINE ADMISSION!!!");
                System.out.println();
                System.out.print("Enter ur Name:");
                nam=as.readLine();
                System.out.print("Enter 1 for Science Stream ,2 for Commerce and 3 For Humanities & 4 to Exit:");
                n=Integer.valueOf(as.readLine());
                if(n==4){
                    System.out.println("\t \t THANK YOU!");
                    break;
                }
                if((seats1==0 && n==1) || (seats2==0 && n==2) || (seats3==0 && n==2))
                {
                    System.out.println("SEATS UNAVAILABLE!");
                    System.out.println("DO YOU WANT TO TRY FOR OTHER STREAM(YES/NO):");
                    check=as.readLine();
                    if(check.equalsIgnoreCase("YES")==true)
                    {
                        System.out.print("Enter 1 for Science Stream ,2 for Commerce and 3 For Humanities & 4 to Exit:");
                        n=Integer.valueOf(as.readLine());
                    }      else
                        continue;
                    if(n==4){
                        System.out.println("THANK YOU!");
                        break;
                    }

                }
            }

            switch(n)
            {

                case 1: System.out.println("FOR SCIENCE:-");

                System.out.print("AGGREGATE(%):");
                agr=Integer.valueOf(as.readLine());        
                System.out.print("Science(%):");
                science=Integer.valueOf(as.readLine());        
                System.out.print("Comp(%):");
                computer=Integer.valueOf(as.readLine());        
                System.out.print("Maths(%):");
                Maths=Integer.valueOf(as.readLine());        
                q=1;
                break;

                case 2:System.out.println("FOR COMMERCE:-");

                System.out.print("AGGREGATE(%):");
                agr=Integer.valueOf(as.readLine());
                System.out.print("Comp(%):");
                computer=Integer.valueOf(as.readLine());
                System.out.print("Maths(%):");
                Maths=Integer.valueOf(as.readLine());
                q=2;
                break;
                case 3:System.out.println("FOR HUMANITIES:-");

                System.out.print("AGGREGATE(%):");
                agr=Integer.valueOf(as.readLine());
                System.out.print("Eng(%):");
                eng=Integer.valueOf(as.readLine());
                System.out.print("Social Science(%):");
                st=Integer.valueOf(as.readLine());
                q=3;
                break;        
                default:
                System.out.println("Wrong input!");
            }
            SFOA1 as1=new SFOA1();
            if(q==1)
            {
                f=as1.Science(agr,Maths,science,computer);
                if(f==1){
                    System.out.println("You r Given Science with Comp");       
                    fee=15000;}
                if(f==2){
                    System.out.println("You are Given Science with Bio");
                    fee=12000;}
            }

            if(q==2)
            {
                f=as1.Commerce(agr,Maths,computer);
                if(f==1)
                    System.out.println("You are Given Commerce with Comp");{
                    fee=12000;}
                if(f==2){
                    System.out.println("You are Given Commerce!without Computer");        
                    fee=10000;
                }    
            }
            if(q==3)
            {
                f=as1.Economics(agr,eng,st);
                if(f==1)
                    System.out.println("You r selected!");         
                fee=10000;    
            }
            if(f==0){
                System.out.println("Sry...You r not elligible...");
                if(n<3){
                    System.out.print("DO YOU WANT TO TRY FOR ");
                    if(n==1)
                        System.out.print("COMMERCE(YES/NO):");
                    else
                        System.out.print("HUMANITIES(YES/NO):");
                    check=as.readLine();
                    if(check.equalsIgnoreCase("YES")==true)
                    {x=1;
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
                System.out.print("Do U want to enter the Payment part(YES/NO):");
                String commit=as.readLine();
                System.out.println();
                if(commit.equalsIgnoreCase("Yes"))
                    k1=as1.Payment(commit);

            }
            if(k1==1){
                x=0;
                as1.receipt(n,fee,nam,f);
            }
            double i=0;
            System.out.println("**************************************************************");
            System.out.println();

        }
    }
}         

