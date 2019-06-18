/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopack;

import java.util.*;

/**
 *
 * @author richa
 */
public class tester {

    public static void main(String[] args) {

        String CompSuit = null;
        String UsrSuit = null;

        int CompScore = 0;
        int UserScore = 0;
        int UsrIn;
        int round = 1;
        int UsrDeck = 26;
        int CompDeck = 26;

        GroupOfCards ch = new GroupOfCards();

        ch.generate();//calls the method to generate the cards
        //now use for loop to print

        System.out.println("List of Cards: \n");

        for (Card cl : ch.list) {

            System.out.println(cl.getS() + " " + cl.getV());

        }

        System.out.println("\n\n************Welcome to War Card Game*******************");
        System.out.println("INSTRUCTIONS: \n Enter A Number from 1 to 4 to make a Random Guess");

        while (UsrDeck > 0 && CompDeck > 0) { 
            
            

            Scanner input = new Scanner(System.in);

            System.out.println("\nEnter Card Suit");
            UsrIn = input.nextInt();

            Random random = new Random();

            int rand = random.nextInt(4) + 1;

            switch (rand) {
                case 1:
                    CompSuit = "Clubs";
                    break;
                case 2:
                    CompSuit = "Diamonds";
                    break;
                case 3:
                    CompSuit = "Hearts";
                    break;
                case 4:
                    CompSuit = "Spades";
                    break;

                default:
                    System.out.println("Error");

            }

            switch (UsrIn) {
                case 1:
                    UsrSuit = "Clubs";
                    break;
                case 2:
                    UsrSuit = "Diamonds";
                    break;
                case 3:
                    UsrSuit = "Hearts";
                    break;
                case 4:
                    UsrSuit = "Spades";
                    break;

                default:
                    System.out.println("Error");

            }

            int UsrVal = random.nextInt(13) + 1;
            String UsrRank;
            
            if(UsrVal == 10){
                UsrRank = "Jack";
            }else if(UsrVal == 11){
                UsrRank = "Queen";
            }else if (UsrVal == 12){
                UsrRank = "King";
            }else if(UsrVal == 13){
                UsrRank = "Ace";
            }else{
                UsrRank = "";
            }

            System.out.println("You chose " + UsrSuit + " " + UsrVal +UsrRank);

            int CompVal = random.nextInt(13) + 1;
             String CompRank;
            
            if(CompVal == 10){
                CompRank = "Jack";
            }else if(CompVal == 11){
                CompRank = "Queen";
            }else if (CompVal == 12){
                CompRank = "King";
            }else if(UsrVal == 13){
                CompRank = "Ace";
            }else{
                CompRank = "";
            }
            System.out.println("\nComputer chose " + CompSuit + " " + CompVal+ CompRank);

            if (CompVal > UsrVal) {

                System.out.println("\n-------------Computer Wins!!----------------");
                CompScore++;
                CompDeck++;
                UsrDeck--;

            } else if (UsrVal > CompVal) {

                System.out.println("\n--------------User Wins!!------------------");
                UserScore++;
                CompDeck--;
                UsrDeck++;
            } else {
                System.out.println("\n....=....War Draw.....=....");
                System.out.println("You Need to break the Tie!");

                CompDeck -= 2;
                UsrDeck -= 2;

            }

            System.out.println("\nScore Board: Round " + round + "\nComputer: " + CompScore + "\nUser: " + UserScore);

            System.out.println("................................................................................");

            System.out.println("\nDecks:\nComputer: " + CompDeck + "\nUser: " + UsrDeck);
            round++;
        }

        System.out.println("................................................................................");
        System.out.println("................................................................................");

        System.out.println("\nFinal Score: \nComputer: " + CompScore + "\nUser: " + UserScore);

        if (CompScore > UserScore) {
            System.out.println("\nComputer Wins The Game!!");
            System.out.println("\nBetter Luck Next Time!");

        } else {
            System.out.println("\nCongrats!!!");
            System.out.println("User Wins The Game!!");
        }

    }

}
