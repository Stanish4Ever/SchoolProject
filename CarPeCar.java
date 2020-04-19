public class CarPeCar
{
    public static void main(int n)
    {
        int n1=n,ns=n*n,k=0,k2=0;
        double s=0.0;
        int l=String.valueOf(n).length();
        k=(int)(ns%Math.pow(10,l));
        s=(ns/Math.pow(10,l));
        k2=(int)s;
        if((k+k2)==n)
        System.out.println("CONGRATS!!KARPREKAR!");
        else
        System.out.println("Sry !It's CarPeCar!"+k+"."+k2);
    }
            
}
