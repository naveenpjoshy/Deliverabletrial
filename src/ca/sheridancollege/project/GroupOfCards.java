/*
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Richard_Persaud,2019 11 july
 */
public class GroupOfCards
{
      private ArrayList<Card> cards;
      private int size;
    GroupOfCards()
    {
        cards = new ArrayList<Card>();
        int ind1, ind2;
        Random generator = new Random();
        Card temp;

       int jokerSt=5;
       int jokerRk = 0;
           cards.add(new Card(jokerSt, jokerRk));
           cards.add(new Card(jokerSt,jokerRk));
        for (int suit=0; suit<=3; suit++)
        {
             for (int rank=0; rank<=12; rank++)
             {
                  cards.add(new Card(suit,rank));
             }
        }



        for (int i=0; i<1000; i++)
        {
            ind1 = generator.nextInt( cards.size() );
            ind2 = generator.nextInt( cards.size() );
            temp = cards.get( ind2 );
            cards.set( ind2 , cards.get( ind1 ) );
            cards.set( ind1, temp );
        }
    }
        public Card drawFromDeck()
    {

        return cards.remove( 0 );
    }
    public void shuffle()
    {

     Collections.shuffle(cards);
    }
    public int getSize(int size)
    {
        return size;
    }
    public void setSize(int givenSize){
     size=givenSize;
    }
}