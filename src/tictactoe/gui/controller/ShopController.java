package tictactoe.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import tictactoe.Models.StyleModel;
import tictactoe.bll.GameBoardSinglePlayer;
import tictactoe.bll.IGameModel;
import tictactoe.bll.Score;

import java.net.URL;
import java.util.ResourceBundle;

public class ShopController implements Initializable {

    public Button clickPinkBtn;
    public Button clickBlueBtn;
    public Button clickYellowBtn;
    public Button clickGreenBtn;
    public Button clickRedBtn;
    StyleModel styleModel1;
    IGameModel scoreSinglePlayer1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        clickBlueBtn.setDisable(true);
        clickYellowBtn.setDisable(true);
        clickPinkBtn.setDisable(true);
        clickYellowBtn.setDisable(true);
        clickRedBtn.setDisable(true);
        clickGreenBtn.setDisable(true);

    }

    public void setGameboard(IGameModel board){
        scoreSinglePlayer1 = board;

        if (Score.getInstance().getScore() >= 2){
            clickPinkBtn.setDisable(false);
            clickRedBtn.setDisable(false);
            clickGreenBtn.setDisable(false);
        }
        if(Score.getInstance().getScore() >= 3){
            clickYellowBtn.setDisable(false);
        }
        if(Score.getInstance().getScore() >= 4){
            clickBlueBtn.setDisable(false);
        }
    }

    public void clickRed(ActionEvent actionEvent) {
        if (Score.getInstance().getScore() >= 2) {
            styleModel1.setButtonsAreYellow(false);
            styleModel1.setButtonsAreGreen(false);
            styleModel1.setButtonsAreBlue(false);
            styleModel1.setButtonsAreRed(true);
            styleModel1.setButtonsArePink(false);

            Score.getInstance().subtractScore(2);
        }

        if (Score.getInstance().getScore() < 2){
            clickRedBtn.setDisable(true);
        }

    }
    public void clickYellow(ActionEvent actionEvent) {
        if (Score.getInstance().getScore() >= 3) {
            styleModel1.setButtonsAreRed(false);
            styleModel1.setButtonsAreGreen(false);
            styleModel1.setButtonsAreBlue(false);
            styleModel1.setButtonsAreYellow(true);
            styleModel1.setButtonsArePink(false);
            Score.getInstance().subtractScore(3);
        }
        if (Score.getInstance().getScore() < 3){
            clickYellowBtn.setDisable(true);
        }
    }
    public void clickGreen(ActionEvent actionEvent) {
        if (Score.getInstance().getScore() >= 2) {
            styleModel1.setButtonsAreRed(false);
            styleModel1.setButtonsAreYellow(false);
            styleModel1.setButtonsAreBlue(false);
            styleModel1.setButtonsAreGreen(true);
            styleModel1.setButtonsArePink(false);
            Score.getInstance().subtractScore(2);
        }
        if (Score.getInstance().getScore() < 2){
            clickGreenBtn.setDisable(true);
        }
    }
    public void clickBlue(ActionEvent actionEvent) {
        if (Score.getInstance().getScore() >= 4) {
            styleModel1.setButtonsAreRed(false);
            styleModel1.setButtonsAreYellow(false);
            styleModel1.setButtonsAreGreen(false);
            styleModel1.setButtonsAreBlue(true);
            styleModel1.setButtonsArePink(false);
            Score.getInstance().subtractScore(4);
        }
        if (Score.getInstance().getScore() < 4){
            clickBlueBtn.setDisable(true);
        }
    }
    public void clickPink(ActionEvent actionEvent) {
        if (Score.getInstance().getScore() >= 2) {
            styleModel1.setButtonsAreRed(false);
            styleModel1.setButtonsAreYellow(false);
            styleModel1.setButtonsAreGreen(false);
            styleModel1.setButtonsAreBlue(false);
            styleModel1.setButtonsArePink(true);
            Score.getInstance().subtractScore(2);
        }
        if (Score.getInstance().getScore() < 2){
            clickPinkBtn.setDisable(true);
        }
    }

    public void setStyleModel(StyleModel styleModel) {
        styleModel1 = styleModel;
    }


}
