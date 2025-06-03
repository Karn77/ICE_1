/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice_1_jaskaran;

/**
 *
 * @author JASKARAN SINGH
 */

import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {

        
        Card[] magicHand = new Card[7];

        // Define possible suits
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        Random rand = new Random();

        // Fill the array with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(suits[rand.nextInt(4)]); 
            magicHand[i] = c;
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts"); 

       
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

      
        if (found) {
            System.out.println("You win! The lucky card (" + luckyCard.getValue() + " of " + luckyCard.getSuit() + ") was found.");
        } else {
            System.out.println("Sorry, you lose. The lucky card (" + luckyCard.getValue() + " of " + luckyCard.getSuit() + ") was not found.");
        }
    }
}