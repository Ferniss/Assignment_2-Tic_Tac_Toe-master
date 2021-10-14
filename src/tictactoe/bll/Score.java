package tictactoe.bll;

public class Score {
    private static Score instance = null;

    public int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public void subtractScore(int score){
            this.score -= score;

    }

    public static Score getInstance(){
        if (instance == null){
            instance = new Score();
        }
        return instance;
    }

}
