package tictactoe.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tictactoe.Models.StyleModel;
import tictactoe.gui.controller.ShopController;

import java.io.IOException;

public class ShopClass {
    StyleModel styleModel1;

    public ShopClass(StyleModel styleModel){
       styleModel1 = styleModel;
    }

    public void OpenShop(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("views/ShopView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            ((ShopController)loader.getController()).setStyleModel(styleModel1);

            stage.setTitle("Skin Shop");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



