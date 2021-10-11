package tictactoe.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ScoreModel {

    @FXML
    private ListView<String> lstScores;

    private final ObservableList<String> winners;

    public ScoreModel() {
        winners = FXCollections.observableArrayList();
        lstScores = new ListView<>();
    }

    public ObservableList<String> getWinners() {
        return winners;
    }

    public void setNextWinner(String winner) {
        winners.add("Player " + winner);
    }

}