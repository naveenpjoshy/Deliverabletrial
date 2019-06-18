package unopack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author richa
 */
public class Card {
        //default modifier for child classes
    
    
    public enum Suit{SPADES,CLUBS,DIAMONDS,HEARTS};
    
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    
        private Value v;
        private Suit s;
        
        
        public Card(Suit su, Value va){
        
            this.v=va;
            this.s=su;
        
        }
 
    public Value getV() {
        return v;
    }

  
    public void setV(Value v) {
        this.v = v;
    }

    
    public Suit getS() {
        return s;
    }


    public void setS(Suit s) {
        this.s = s;
    }
       
   
}

