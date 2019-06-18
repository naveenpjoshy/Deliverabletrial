/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopack;

/**
 *
 * @author richa
 */
public interface NewInterface {

    /**
     * @return the playerID
     */
    String getPlayerID();

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    void setPlayerID(String givenID);
    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    
}
