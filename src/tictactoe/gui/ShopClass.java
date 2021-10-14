package tictactoe.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tictactoe.Models.StyleModel;
import tictactoe.bll.IGameModel;
import tictactoe.gui.controller.ShopController;

import java.io.IOException;

public class ShopClass {
    StyleModel styleModel1;
    IGameModel board;

    public ShopClass(StyleModel styleModel, IGameModel board){
       styleModel1 = styleModel;
       this.board = board;

    }

    public void OpenShop(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("views/ShopView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            ((ShopController)loader.getController()).setStyleModel(styleModel1);
            ((ShopController) loader.getController()).setGameboard(board);
            stage.setTitle("Skin Shop");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



