import java.io.*;
public class Point
{
    double x,y;
    Point()
    {
        x=0.0;
        y=0.0;
    }
    void readpoint()throws IOException
    {
        BufferedReader as = new BufferedReader(new InputStreamReader(System.in));
     
        System.out.print("Enter the Cordinates for->\n\t x:");
        x=Double.valueOf(as.readLine());
        System.out.print("\t y:");
        y=Double.valueOf(as.readLine());
    }
    void displaypoint()
    {
        System.out.println("The Coordinates in the form (x,y): ("+x+","+y+")");
    }
    Point midpoint(Point A, Point B)
    {
        this.x=(A.x+B.x)/2;
        this.y=(A.y+B.y)/2;
        return this;
    }
    public static void main(String args[])throws IOException
    {       
        System.out.println("\t\t ~MID POINT FINDER~\n\n");
        Point a=new Point();
        Point b=new Point();
        Point mid= new Point();
        System.out.println(" For Point A: \n");
        a.readpoint();
        a.displaypoint();
        System.out.println("\n For Point B: \n");
        b.readpoint();
        b.displaypoint();
        mid.midpoint(a,b);
        System.out.println("\nThe Midpoint between A and B lies at: \n");
        mid.displaypoint();
        
    }
}
