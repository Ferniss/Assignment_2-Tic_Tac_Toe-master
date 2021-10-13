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
        System.out.println("cmon");

    }
    public void click(ActionEvent actionEvent) {
        System.out.println("hej");
        styleModel1.setButtonsAreYellow(false);
        styleModel1.setButtonsAreRed(true);
        //btn.getStyleClass().add("red");

            }
    public void clickYellow(ActionEvent actionEvent) {
        System.out.println("hej");
        styleModel1.setButtonsAreRed(false);
        styleModel1.setButtonsAreYellow(true);
    }

    public void setStyleModel(StyleModel styleModel) {
        styleModel1 = styleModel;
    }
}
