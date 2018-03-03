import java.util.Scanner; // Create a Scanner import statement

import static java.lang.System.in;
import static java.lang.System.out;

public class TripPlanner { // Create a Class
    public static void main(String[] args) { // Invoke the Main
        greetings(); // Create a Method
        traveltimebudget(); // Create a Second Method
        timedifference();  // Create a third method
        squarearea(); // Create the fourth method
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
    }
    private static void traveltimebudget() { // Call the Second Method
        try (Scanner input = new Scanner(in)) {
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
            System.out.println("If your traveling for" + " " + Days + " " + "days" + " " + "it is the same as:" + DayHours + " " + "hours" + " " + InitialCurrency + " " + "or" + " " + HoursMinutes + " " + "Minutes");
            int ExpensesPerDay;
            ExpensesPerDay = Money / Days;
            System.out.println("If you going to spend" + " " + "$" + Money + CSymbol + "that means you can spend up to" + "$" + ExpensesPerDay + " " + CSymbol);
        }
    }
    private static void timedifference() {
        Scanner input = new Scanner(in);
        out.println("What is the time diffence in hours between you home and your destination?");
        int difference = input.nextInt();
        int gmt = 24;
        int wholeday = 12;
        int tdiff= (difference % gmt);
        long gmtdiff = wholeday + difference;
        String timesymbol = ":00";
        out.println("That means that when it is midnight at home it will be"+tdiff+timesymbol+"in your travel destination");
        out.println("and when it is noon at home it will be"+ gmtdiff+timesymbol);
        out.println("**********************************************");

    }

    private static void squarearea() {
        Scanner input = new Scanner(in);
        out.println("What is the square area of your destination country in km2 ?");
        int CSquareArea = input.nextInt();
        double valmilessquare = 2.58998811;
        double MilesSquare = CSquareArea / valmilessquare;
        out.println("in Miles2 that is:"+ MilesSquare);
        out.println("***********************************************");

    }


}