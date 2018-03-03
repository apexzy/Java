import java.util.Scanner;

import static java.lang.System.*;

public class ScannerMethods {
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        out.println("Welcome!");
        out.println("What is your name?");
        String Name = input.nextLine();
        out.println("Hello " + Name);
        out.println("Whats your Bank?");
        String bank = input.next();
        out.println("Hello!"+" "+Name +","+"Your Bank Name is "+bank+" "+"Bank Nigeria PLC.");
        out.println("Select your Account:");
        String Account1 = "Savings";
        String Account2 = "Withdraw";
        String Account = input.next();
        out.println("Input your Account Number:");
        int AccountNumber1 = 8000;
        int AccountNumber2 =9083;
        int AccountNumber3 = 9086;
        int Number  = input.nextInt();
        String Naira = "#";
        int InitialBalance = 6700;
        int ClosingBalance = 40000;
        int Withdraw = 4000;
        out.println("Choose your options(Withdraw, Balance):");
        String Options = input.next();
        out.print(Name + " " + Number + " " + " " + "Your balance is:" +" " +"Initial Balance:" + " " + Naira+InitialBalance + " " + "Closing Balance:" +" "+ ClosingBalance);

    }


}
