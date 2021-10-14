package tictactoe.Models;

public class StyleModel {

    private boolean buttonsAreRed = false;
    private boolean buttonsAreYellow = false;
    private boolean buttonsAreGreen = false;
    private boolean buttonsAreBlue = false;
    private boolean buttonsArePink = false;


    public boolean isButtonsAreRed() {
        return buttonsAreRed;
    }
    public void setButtonsAreRed(boolean buttonsAreRed) {
        this.buttonsAreRed = buttonsAreRed;
    }


    public boolean isButtonsAreYellow(){
        return buttonsAreYellow;
    }
    public void setButtonsAreYellow(boolean buttonsAreYellow) {
        this.buttonsAreYellow = buttonsAreYellow;
    }


    public boolean isButtonsAreGreen() {return buttonsAreGreen;}
    public void setButtonsAreGreen(boolean buttonsAreGreen) {
        this.buttonsAreGreen = buttonsAreGreen;
    }

    public boolean isButtonsAreBlue() {return buttonsAreBlue;}
    public void setButtonsAreBlue(boolean buttonsAreBlue) {
        this.buttonsAreBlue = buttonsAreBlue;
    }

    public boolean isButtonsArePink() {return buttonsArePink;}
    public void setButtonsArePink(boolean buttonsArePink) {this.buttonsArePink = buttonsArePink;}


}
