package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign.equals("rock")) {
            return "paper";
        } else if (handSign.equals("paper")) {
            return "scissor";
        } else {
            return "rock";
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equals("rock")) {
            return "scissor";
        } else if (handSign.equals("paper")) {
            return "rock";
        } else {
            return "paper";
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (getWinningMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            return handSignOfPlayer2;
        } else if (getWinningMove(handSignOfPlayer2).equals(handSignOfPlayer1)) {
            return handSignOfPlayer1;
        } else {
            return "tie";
        }
    }
}
