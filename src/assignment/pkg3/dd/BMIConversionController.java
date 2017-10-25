/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ddose
 */
public class BMIConversionController implements Initializable
{

    private BMIConversionModel BMImodel = new BMIConversionModel();

    @FXML
    private TextField txtHeight;
    @FXML
    private TextField txtWeight;
    @FXML
    private TextField lblResult;
    @FXML
    private Button btnCalcBMI;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");

        double height = Double.parseDouble(txtHeight.getText());
        double weight = Double.parseDouble(txtWeight.getText());

        double resultBMI = BMImodel.getBMI(height, weight);
        String resultAsString = String.format("%.1f", resultBMI);
        lblResult.setText(resultAsString);
    }

}
