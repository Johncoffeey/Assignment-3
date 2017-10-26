/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author ddose
 */
public class NumberConversionController implements Initializable
{

    private NumberConversionModel ncmodel = new NumberConversionModel();

//    @FXML
//    private Label label; //Label to the greetings message
    @FXML
    private TextField txtNumberInput;

    @FXML
    private TextField txtResult;

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getMilesFromKilometers(txtFieldValue);
        String resultAsString = String.format("%.3f", resultInMiles);
        txtResult.setText(resultAsString);
    }

    @FXML
    private void handleButtonAction2(ActionEvent event)
    {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getKilometersFromMiles(txtFieldValue);
        String resultAsString = String.format("%.3f", resultInMiles);
        txtResult.setText(resultAsString);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
//        TextInputDialog dialog = new TextInputDialog("");
//
//        dialog.setTitle("Text Input Dialog");
//        dialog.setContentText("Please enter your name:");
//
//        Optional<String> result = dialog.showAndWait();
//        if (result.isPresent())
//        {
//            String message = ncmodel.getGreetingsMessage(result.get());
//            label.setText(message);
//        }
    }

}
