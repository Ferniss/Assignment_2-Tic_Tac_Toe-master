package tictactoe.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import tictactoe.Models.StyleModel;

import java.net.URL;
import java.util.ResourceBundle;

public class ShopController implements Initializable {

    StyleModel styleModel1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    public void clickRed(ActionEvent actionEvent) {
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreGreen(false);
        styleModel1.setButtonsAreRed(true);

            }
    public void clickYellow(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreGreen(false);
        styleModel1.setButtonsAreYellow(true);
    }
    public void clickGreen(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreGreen(true);
    }

    public void setStyleModel(StyleModel styleModel) {
        styleModel1 = styleModel;
    }


}
