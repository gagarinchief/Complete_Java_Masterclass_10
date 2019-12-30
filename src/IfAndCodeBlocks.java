public class IfAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 and greater than 1000");
//        } else if (score < 1000){
//            System.out.println("Your score is less than 1000");
//        }else {
//            System.out.println("Got here");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }
        boolean gameOverSecond = true;
        int secondScore = 10000;
        int levelCompletedSecond = 8;
        int secondBonus = 200;
        System.out.println("");
        if (gameOverSecond == true) {
            int finalScore = secondScore + (levelCompletedSecond + secondBonus);
            System.out.println("Your second final score was " + finalScore);

        }
    }
}
