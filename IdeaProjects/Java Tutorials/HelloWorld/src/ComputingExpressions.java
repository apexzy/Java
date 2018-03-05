import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class ComputingExpressions {
    public static void main (String[] args){

        Scanner input = new Scanner(in);
        System.out.println("Input the first number:");
        double A = input.nextDouble();
        System.out.println("Input the Second number:");
        double B = input.nextDouble();
        System.out.print("Input the third numebr:");
        double C = input.nextDouble();
        System.out.print("Input the fourth numebr:");
        int D = input.nextInt();
        System.out.print("Input the fifth numebr:");
        double E = input.nextDouble();
        System.out.print("Input the sixth numebr:");
        double F = input.nextDouble();
        double FirSecNumbCal = A * B - C * D / E - F;
        double Total = FirSecNumbCal * 100;
        System.out.println("The Answer is:" +" " +Total);
        System.out.println("Thank you for using Computing Expressions Proram...");


    }
}
