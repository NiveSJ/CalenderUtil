package se.lexicon;

import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*Calendar cal=Calendar.getInstance();
        cal.set(2018,01,01);
        System.out.println(cal.get(Calendar.FEBRUARY));
        cal.add(Calendar.DATE,7);
        System.out.println("Year = " + cal.get(Calendar.DATE));*/


        Calendar cal = Calendar.getInstance();
        cal.set(2017,11,31);
        System.out.println("M"+"\t"+"T"+"\t"+"W"+"\t"+"T" +"\t"+"F"+ "\t"+"S"+"\t"+"SU");

        System.out.println("___________________________");
        for(int i=1;i<=31;i++){

              cal.add(Calendar.DAY_OF_MONTH,+1);
            System.out.print(  cal.get(5)+ "\t");

            if(i == 7|| i == 14|| i == 21 || i==28)
                System.out.println("\n");
        }

    }
}
