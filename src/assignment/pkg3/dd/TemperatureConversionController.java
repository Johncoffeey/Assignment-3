/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ddose
 */
public class TemperatureConversionController implements Initializable
{

    @FXML
    private TemperatureConversionModel tcmodel = new TemperatureConversionModel(); //Makes controller know class.TemperatureConversionModel and sets name to tcmodel.
    @FXML
    private ComboBox<String> comboConversion; //Make sure to change ComboBox<?>
    @FXML
    private TextField txtInput;
    @FXML
    private Label lblResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        comboConversion.setItems(FXCollections.observableArrayList("Celcius to Fahrenheit", "Fahrenheit to Celcius")); //setItems in the ComboBox in scenebuilder
        comboConversion.setVisibleRowCount(2); //Not sure what this does, works fine even when i out comment it.
    }

    /**
     *
     * @param event
     */
    @FXML
    public void handleSelectComboBox(ActionEvent event)
    {
        double inputTemp = Double.parseDouble(txtInput.getText());
        double tempValue = 0;

        int selectedIndex = comboConversion.getSelectionModel().getSelectedIndex(); //variable that stores the selected answer in ComboBox
        switch (selectedIndex)
        {
            case 0:
                tempValue = tcmodel.getTemperatureInFahrenheit(inputTemp);
                break;
            case 1:
                tempValue = tcmodel.getTemperatureInCelcius(inputTemp);
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");
        }

        String resultText = String.valueOf(tempValue);
        lblResult.setText(resultText);

    }

}
