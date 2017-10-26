/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.dd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class ChooseConversionController implements Initializable
{

    @FXML
    private ComboBox<String> comboChoose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        comboChoose.setItems(FXCollections.observableArrayList("BMI Calculator", "Temperature conversion", "Miles/Kilometers calculator"));
        comboChoose.setVisibleRowCount(3);
    }

    public void handleSelectComboBox(ActionEvent event) throws IOException
    {
        int selectedConversion = comboChoose.getSelectionModel().getSelectedIndex();
        switch (selectedConversion)
        {
            case 0:
                FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("BMIConversion.fxml"));
                Parent root1 = (Parent) fxmlLoader1.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                //stage.initStyle(StageStyle.UNDECORATED); // This line can be used if u dont want the top of a window, where u can close the window
                stage.setScene(new Scene(root1));
                stage.show();
                break;
            case 1:
                FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("TemperatureConversion.fxml"));
                Parent root2 = (Parent) fxmlLoader2.load();
                Stage stage2 = new Stage();
                stage2.initModality(Modality.APPLICATION_MODAL);
                stage2.setScene(new Scene(root2));
                stage2.show();
                break;
            case 2:
                FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("NumberConversion.fxml"));
                Parent root3 = (Parent) fxmlLoader3.load();
                Stage stage3 = new Stage();
                stage3.initModality(Modality.APPLICATION_MODAL);
                stage3.setScene(new Scene(root3));
                stage3.show();
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");
        }
    }

//    @Override
//    public void start(Stage stage) throws Exception
//    {
//        Parent root = FXMLLoader.load(getClass().getResource("ChooseConversion.fxml"));
//
//        Scene scene = new Scene(root);
//
//        stage.setScene(scene);
//        stage.show();
//    }
}
