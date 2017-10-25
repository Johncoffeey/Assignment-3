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
public class TemperatureConversionModel
{

    /**
     *
     * @param temp This method, calculates tempature (entered by user) to
     * fahrenheit
     * @return answer a
     */
    public double getTemperatureInFahrenheit(double temp)
    {
        double a = temp * 9 / 5 + 32; //calculates, instance double a
        return a;
    }

    /**
     *
     * @param temp This method, calculates tempature (entered by user) to
     * celcius
     * @return
     */
    public double getTemperatureInCelcius(double temp)
    {
        double b = (temp - 32) / 1.8; //calculates, instance double b
        return b;
    }

}
