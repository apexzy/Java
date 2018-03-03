import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ScanMe {
    public static void main (String[] args){
        greetings();
        timebudget();
        timedifference();
        squarearea();
    }

    private static void greetings() { // Call the Method
        Scanner input = new Scanner(in); //Import a new Scanner
        out.println("Welcome to Vacation Planner!");
        out.println("What is your name?");
        String Name = input.nextLine();
        System.out.print("Nice to meet you" + " " + Name + ",");
        System.out.println(" " + "where are you travelling to?");
        String Destination = input.nextLine();
        System.out.println("Great!" + " " + Destination + " " + "Sounds like a great trip");
        out.println("*********************************************************************");
    }

    private static void timebudget() {
        Scanner input = new Scanner(in);
        out.println("How many days will you spend travelling?");
        int Days = input.nextInt();
        int Hours;
        Hours = 24;
        double DayHours;
        DayHours = Days / Hours;
        double HoursMinutes;
        int Minutes = 60;
        HoursMinutes = Minutes * DayHours;
        out.println("How much money in USD, are you planning to spend on your trip?");
        int Money = input.nextInt();
        out.println("What is the three letter currency symbol, for your travel destinatin?");
        String CSymbol = input.next();
        String InitialCurrency = "USD";
        out.println("How many" + " " + CSymbol + " " + "are there in" + " " + "1" + " " + InitialCurrency + "?");
        double ExchangeRate = input.nextDouble();
        System.out.printf("If your traveling for  %d days it is the same as:%s hours %s or %s Minutes%n", Days, DayHours, InitialCurrency, HoursMinutes);
        int ExpensesPerDay;
        ExpensesPerDay = Money / Days;
        System.out.println("If you going to spend" + " " + "$" + Money + " "+CSymbol+" "+ "that means you can spend up to" + " "+"$" + ExpensesPerDay + " " + CSymbol);
    }

    private static void timedifference() {
        Scanner input = new Scanner(in);
        out.println("What is the time diffence in hours between you home and your destination?");
        int differnce =  input.nextInt();
        int gmt = 24;
        int wholeday = 12;
        int tdiff= (differnce % gmt);
        long gmtdiff = wholeday + differnce;
        String timesymbol = ":00";
        out.println("That means that when it is midnight at home it will be"+tdiff+timesymbol+"in your travel destination");
        out.println("and when it is noon at home it will be"+" "+ gmtdiff+" "+timesymbol);
        out.println("*********************************************************************");

    }

    private static void squarearea() {
        Scanner input = new Scanner(in);
        out.println("What is the square area of your destination country in km2 ?");
        int CSquareArea = input.nextInt();
        double valmilessquare = 2.58998811;
        double MilesSquare = (int) (CSquareArea / valmilessquare);
        out.println("in Miles2 that is:"+ MilesSquare);
        out.println("*********************************************************************");

    }

}
