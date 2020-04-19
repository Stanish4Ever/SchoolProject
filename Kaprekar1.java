 
import java.util.Scanner;
 
public class Kaprekar1 {
 
    // main method begins execution of this class
    public static void main(String args[]) {
 
        int square, temp, counter = 0, rem, quo;
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        // Waiting for the user input
        int n = sc.nextInt();
        temp = n;
        square = n * n;
 
        while (n != 0) {
            counter++;
            n = n / 10;
        }
        rem = square % ((int) Math.pow(10, counter));
        quo = square / ((int) Math.pow(10, counter));
        
        if ((rem + quo) == temp) {
            System.out.println(temp + " is a kaprekar number ");
        } else {
            System.out.println(temp + " is not a kaprekar number ");
        }
 
    } // end method main
} // end cla