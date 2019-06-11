/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;
import java.util.Random;
/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Naveen_Punchakunnel_Joshy, 2019 
 */
public class Card
{
    private int rank, suit;
    private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs", "Joker"    };
    private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    private static String[] jokers = {"Joker", "Joker"};
    private static String[] ranks2 = {"0", "0"};
    public static String rankAsString( int score ) {
        if (score != 0){
            return ranks[score];
        }
        return ranks2[score];
    }

    Card(int suit, int rank)
    {
        this.rank=rank;
        this.suit=suit;    
    }
    @Override
    public  String toString()
    {
        if(suit == 5){
            return "Joker";
        }
        if(rank == 0){
            return "Joker";
        }
        return ranks[rank] + " of " + suits[suit];              
    }

    public int getRank() {
         return rank;
    }

    public int getSuit() {
        return suit;
    }
}
