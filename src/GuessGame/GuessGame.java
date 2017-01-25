public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame();
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;
    /*declare variables to hold the three guesses the players make*/

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;
    /*declare  three variables to hold a true or false based on the players answer*/

    int targetNumber = (int)(Math.random * 10); //making target number player need to guess
    System.out.println("I'm thinking of a number between 0 and 9 ...");

    while(true) {
    }
}

