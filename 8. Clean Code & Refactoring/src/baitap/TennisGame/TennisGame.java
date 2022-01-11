package baitap.TennisGame;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else {
            boolean comparePlayerScore = player1Score >= 4 || player2Score >= 4;
            if (comparePlayerScore) {
                score = new StringBuilder(winCondition(player1Score, player2Score));
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = player1Score;
                    else {
                        score.append("-");
                        tempScore = player2Score;
                    }
                    switch (tempScore) {
                        case 0:
                            score.append("Love");
                            break;
                        case 1:
                            score.append("Fifteen");
                            break;
                        case 2:
                            score.append("Thirty");
                            break;
                        case 3:
                            score.append("Forty");
                            break;
                    }
                }
            }
        }
        return score.toString();
    }

    private static String winCondition(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}