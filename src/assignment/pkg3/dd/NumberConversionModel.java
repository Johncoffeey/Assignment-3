/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

/**
 *
 * @author ddose
 */
public class NumberConversionModel
{

    private static final double MILES_TO_KM_FACTOR = 1.609344;
    private static final double KM_TO_MILES_FACTOR = 0.621371192;

//    public String getGreetingsMessage(String name)
//    {
//        return "Hello," + name + ".Greetings from the top Java developer class in town";
//    }
    public double getMilesFromKilometers(double km)
    {
        double miles = km * MILES_TO_KM_FACTOR;
        return miles;
    }

    public double getKilometersFromMiles(double miles)
    {
        double km = miles * KM_TO_MILES_FACTOR;
        return km;
    }

}
