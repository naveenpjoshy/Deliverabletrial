/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Denbin_Jose, 2019
 */
public class Player{
     Card[] playerOneCards;
     Card[] playerTwoCards;
    private int[] value;
    private String playerID;
    public String getPlayerID(){
        return playerID;
    }
    public void setPlayerID(String givenID){
    playerID=givenID;
    }

    Player(GroupOfCards d,int gameNum)
    {
        playerID= "playerName";
        value = new int[gameNum+3];
        playerOneCards = new Card[gameNum+2];
        playerTwoCards = new Card[gameNum+2];
             
        for (int a=0; a<gameNum+3; a++)
        {
            
        playerOneCards[a] = d.drawFromDeck(); 
        playerTwoCards[a] = d.drawFromDeck(); 
        
        }
    }
}