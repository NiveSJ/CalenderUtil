package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

import se.lexicon.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /*Calendar cal=Calendar.getInstance();
        cal.set(2018,01,01);
        System.out.println(cal.get(Calendar.FEBRUARY));
        cal.add(Calendar.DATE,7);
        System.out.println("Year = " + cal.get(Calendar.DATE));*/


        Months months;
        int dayLen = 0;

        Calendar cal = Calendar.getInstance();
        cal.set(2017, 11, 30);
        System.out.println(cal.getTime());  //30 dec

        cal.add(Calendar.DATE, 1);  // Increment one day   31 dec
        int count = 1;

        System.out.println("___________________________");
        for (Months mon : Months.values()) {


            dayLen = mon.getDay();

            System.out.println("\n###" + mon + "###");


            cal.add(Calendar.DATE, 1); // jan 1
            String str = String.valueOf(cal.getTime());
            String str1 = str.substring(0, 3);
            System.out.println(str1);
            System.out.println(cal.getTime());


            System.out.print("M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");
            System.out.print("\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");
            System.out.print("\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");
            System.out.print("\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");
            System.out.print("\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");
            System.out.println("\n");

            int k = 0;
            switch (str1) {
                case "Mon":
                    System.out.print(cal.get(5) + "\t");
                    break;
                case "Tue":
                    k = 6;
                    System.out.print(" " + "\t" + cal.get(5) + "\t");
                    break;
                case "Wed":
                    k = 5;
                    System.out.print(" " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Thu":
                    k = 4;
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Fri":
                    k = 3;
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Sat":
                    k = 2;
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Sun":
                    k = 1;
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;

            }

            for (int i = 1; i < dayLen; i++) {


                cal.add(Calendar.DATE, 1);
                System.out.print(cal.get(5) + "\t");


            }


        }

    }


}







