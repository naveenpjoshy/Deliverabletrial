package unopack;


/**
 *
 * @author richa
 */
import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    //the size of the grouping
    private final int size = 52;
 
     
   Card[] list = new Card[size];
    
    
    public void generate(){
 
    int counter=0;
    
        for(Card.Suit s: Card.Suit.values()){

            for(Card.Value v: Card.Value.values()){
                
               // WeekCard c1 = new WeekCard(s,v);
                list[counter] = (new Card(s,v));
                counter++;
            }
        }
    
    }
    
}//end class
