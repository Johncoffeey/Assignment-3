/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class TextSolverController implements Initializable
{

    private TextSolverModel tsmodel = new TextSolverModel();
    @FXML
    private TextField txtInput;
    @FXML
    private Label lblResult;
    @FXML
    private ComboBox<String> comboChoose;
    @FXML
    private Button btnSubmit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        comboChoose.setItems(FXCollections.observableArrayList("Exercise seven", "Exercise eight", "Exercise nine", "Exercise 11"));
        comboChoose.setVisibleRowCount(4);
    }

    /**
     *
     * @param event - Takes the text wich , the user types in text field, and
     * solves different puzzles with it.
     */
    @FXML
    private void handleButtonAction(ActionEvent event)
    {

        int selectedIndex = comboChoose.getSelectionModel().getSelectedIndex(); //variable that stores the selected answer in ComboBox
        switch (selectedIndex)
        {
            case 0:
                printLabel();
                break;
            case 1:
                firstName();
                break;
            case 2:
                lastName();
                break;
            case 3:
                uppercaseName();
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");
        }

    }

    private void printLabel()
    {
        String userInput = txtInput.getText(); //declare a string variable, named userInput, to be the same as the text input in textfield.

        if (userInput.equals(""))
        {
            return;
        } else
        {
            lblResult.setText("a) " + userInput + "\n"
                    + "b) " + userInput.toUpperCase() + "\n" //transform word into upper cases
                    + "c) " + userInput.toLowerCase() + "\n" //transform word into lower cases
                    + "d) " + userInput.trim().replaceAll(" ", "").length() + "\n" //counts lettes
                    + "e) " + userInput.charAt(0) + "\n" //find first character
                    + "f) " + userInput.charAt(userInput.trim().length() - 1) + "\n" //Find last character
                    + "g) " + userInput.indexOf("a"));
        }
    }

    private void firstName()
    {
        String userInput = txtInput.getText(); //declare a string variable, named userInput, to be the same as the text input in textfield.
        String splitter[] = userInput.split(" "); //new array splitter, that splits userInput

        lblResult.setText(splitter[0]); //sets label index 0 after the split.
    }

    private void lastName()
    {
        String userInput = txtInput.getText(); //declare a string variable, named userInput, to be the same as the text input in textfield.
        String splitter[] = userInput.split(" "); //new array splitter, that splits userInput

        lblResult.setText(splitter[splitter.length - 1]); //sets label index.length -1 to get the last splitter.
    }

    private void uppercaseName()
    {
        String userInput = txtInput.getText(); //declare a string variable, named userInput, to be the same as the text input in textfield.
        String splitter2[] = userInput.split(" ");
        String tempString = "";

        for (int i = 0; i < splitter2.length; i++)
        {
            String string = splitter2[i].substring(0, 1).toUpperCase() + splitter2[i].substring(1).toLowerCase();
            if (tempString.equals(""))
            {
                tempString = string;
            } else
            {
                tempString = tempString + " " + string;
            }
        }
        lblResult.setText(tempString);
    }

}
