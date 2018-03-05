import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ScanMe {
    public static void main (String[] args){
        greetings();
        timebudget();
        timedifference();
        squarearea();
        LongtudeLatitude();
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
        double Hours;
        Hours = 24;
        double DayHours;
        DayHours = Days / Hours;
        int answerDayHrs = (int) (DayHours * 100.0);
        double HoursMinutes;
        double Minutes = 60;
        HoursMinutes = Minutes * DayHours;
        out.println("How much money in USD, are you planning to spend on your trip?");
        int Money = (int) input.nextDouble();
        out.println("What is the three letter currency symbol, for your travel destination?");
        String CSymbol = input.next();
        String InitialCurrency = "USD";
        out.println("How many" + " " + CSymbol + " " + "are there in" + " " + "1" + " " + InitialCurrency + "?");
        double ExchangeRate = input.nextDouble();
        System.out.println("If your traveling for" +Days+"it is the same as:"+ answerDayHrs+"or"+ InitialCurrency + HoursMinutes);
        double ExpensesPerDay = Money / Days;
        int answerfromone = (int) ((int) ExpensesPerDay * 100.0);

        System.out.println("If you going to spend" + " " + "$" + Money + " "+CSymbol+" "+ "that means you can spend up to" + " "+"$" + answerfromone + " " + CSymbol);
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
        int  MilesSquare = (int) (CSquareArea / valmilessquare);
        int sum = (int) (MilesSquare * 100.0);
        int answerfromtwo = (int) ((int) sum / 100.0);
        out.println("in Miles2 that is:"+ sum);
        out.println("*********************************************************************");

    }
    private static void LongtudeLatitude() {
        Scanner input = new Scanner(in);
        out.println("What is the longitude for your home?");
        double Longtud = input.nextDouble();
        out.println("What is the Latitude for your home?");
        double Latud = input.nextDouble();
        out.println("What is the longitude for your travel destination?");
        double DestLongtud = input.nextDouble();
        out.println("What is the latitude for your travel destination?");
        double DestLatud = input.nextDouble();


                System.out.print("The distance between those points is:" 
                        + distance_Between_LatLong(Latud, Longtud, DestLatud, DestLongtud) + " km\n");
    }

    private static double distance_Between_LatLong(double latud, double longtud, double destlatud, double destLongtud) {
        latud = Math.toRadians(latud);
        longtud = Math.toRadians(longtud);
        destlatud = Math.toRadians(destlatud);
        destLongtud = Math.toRadians(destLongtud);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(latud)*Math.sin(longtud) + Math.cos(destLongtud)*Math.cos(destlatud)*Math.cos(longtud - destLongtud));

    }
}


