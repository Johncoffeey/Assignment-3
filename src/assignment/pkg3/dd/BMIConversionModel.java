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
public class BMIConversionModel
{

    public double getBMI(double height, double weight)
    {
        height = height / 100;
        double BMI = weight / (Math.pow(height, 2));
        return BMI;
    }

}
