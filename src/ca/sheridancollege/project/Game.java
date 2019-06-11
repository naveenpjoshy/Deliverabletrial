/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;



/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Jacques Kalala, 2019
 */

import java.util.*;
public class Game {
    private final String gameName="Cards";
    public static void main(String[] args) {

        GroupOfCards deckOfCards;
        deckOfCards = new GroupOfCards();
       int size=52;
        System.out.println(deckOfCards.getSize(size));
        System.out.println(deckOfCards.getClass());
        int gameNum=1;
        Player player = new Player(deckOfCards, gameNum); 
    
    Card[] player1Hand = player.playerOneCards; 
    Card[] player2Hand = player.playerTwoCards;     
        }//End of arguments
    }