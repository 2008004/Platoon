package Platoon;

public class gameLoop {

    public boolean loop(){




        int[] vals = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] types = {"King", "Queen", "Jack", "Joker", "Bishop"};
        Deck numDeck = new Deck(vals);
        Deck faceDeck = new Deck(types);
        int playerScore = 0;
        int enemyScore = 0;
        int[] enemyUsed = new int[]{};
        int[] playerUsed = new int[]{};
        Player player1 = new Player(numDeck, faceDeck);
        Player player2 = new Player(numDeck, faceDeck);
        while (playerScore < 3 && enemyScore < 3) {

            //player turn

                //fight an army that's not on the used list and then change the score depending

            //enemy turn

                //fight an army that's not on the used list and then change the score depending


        }

        if (playerScore > 3){
            return true;
        }

        if (enemyScore > 3){
            return false;
        }

        return false;

    }



}
