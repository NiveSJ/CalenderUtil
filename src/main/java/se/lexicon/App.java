package se.lexicon;

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


        System.out.println("___________________________");
        for (Months mon : Months.values()) {
            dayLen = mon.getDay();
            System.out.println("###" + mon + "###");

            cal.add(Calendar.DATE, 1); // jan 1
            String str = String.valueOf(cal.getTime());
            String str1 = str.substring(0, 3);
            System.out.println(str1);
            System.out.println(cal.getTime());


            System.out.println("M" + "\t" + "T" + "\t" + "W" + "\t" + "T" + "\t" + "F" + "\t" + "S" + "\t" + "SU");


            switch (str1) {
                case "Mon":
                    System.out.print(cal.get(5) + "\t");
                    break;
                case "Tue":
                    System.out.print(" " + "\t" + cal.get(5) + "\t");
                    break;
                case "Wed":
                    System.out.print(" " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Thu":
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Fri":
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Sat":
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;
                case "Sun":
                    System.out.print(" " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + cal.get(5) + "\t");
                    break;

            }

            for (int i = 2; i <= dayLen; i++) {

                cal.add(Calendar.DATE, 1);
                System.out.print(cal.get(5) + "\t");
             /*   String week = String.valueOf(cal.getTime());
                String week1 = str.substring(0, 3);
                if(week1 == "Sun")
                    System.out.println("\n");*/


                if (i == 7 || i == 14 || i == 21 || i == 28)
                    System.out.println("\n");
            }

            System.out.println(cal.getTime());


        }
    }
}
