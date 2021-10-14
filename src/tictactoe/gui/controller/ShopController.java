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
        styleModel1.setButtonsAreBlue(false);
        styleModel1.setButtonsAreRed(true);
        styleModel1.setButtonsArePink(false);
    }
    public void clickYellow(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreGreen(false);
        styleModel1.setButtonsAreBlue(false);
        styleModel1.setButtonsAreYellow(true);
        styleModel1.setButtonsArePink(false);
    }
    public void clickGreen(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreBlue(false);
        styleModel1.setButtonsAreGreen(true);
        styleModel1.setButtonsArePink(false);
    }
    public void clickBlue(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreGreen(false);
        styleModel1.setButtonsAreBlue(true);
        styleModel1.setButtonsArePink(false);
    }
    public void clickPink(ActionEvent actionEvent) {
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreGreen(false);
        styleModel1.setButtonsAreBlue(false);
        styleModel1.setButtonsArePink(true);
    }

    public void setStyleModel(StyleModel styleModel) {
        styleModel1 = styleModel;
    }


}
