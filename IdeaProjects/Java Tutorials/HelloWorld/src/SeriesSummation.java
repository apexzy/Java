import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class SeriesSummation {
    public static void main (String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("Input the first number:");
        double o = input.nextDouble();
        System.out.println("Input the Second number:");
        double t = input.nextDouble();
        System.out.print("Input the third number:");
        double th = input.nextDouble();
        System.out.print("Input the fourth number:");
        double f = input.nextDouble();
        System.out.print("Input the fifth number:");
        double fi = input.nextDouble();
        System.out.print("Input the sixth number:");
        double six = input.nextDouble();
        System.out.print("Input the seventh number:");
        double sev = input.nextDouble();
        System.out.print("Input the eigth numebr:");
        double eght = input.nextDouble();
        System.out.print("Input the nineth numebr:");
        double nin = input.nextDouble();
        double FirSecNumbCal = o+t+th+f+fi+six+sev+eght+nin;
        double Total = FirSecNumbCal;
        System.out.println("The Answer is:" +" " +FirSecNumbCal);
        System.out.println("Thank you for using Series Summation Proram...");
    }
}


