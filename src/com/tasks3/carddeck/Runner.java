package com.tasks3.carddeck;

/**
 * Created by yurko on 16.03.17.
 */
public class Runner {
    public static void main(String[] args) {
        Deck cardDeck = new Deck();
        cardDeck.shuffle();
        int i;
        /*while (cardDeck.hasNext() && i < 10){
            Card topCard = cardDeck.drawOne();
            System.out.println(++i + ": "  + topCard.getRank().getName() +" of  " + topCard.getSuit().getName());
        } */

        System.out.println();
        i=0;
        cardDeck.order();
        while (cardDeck.hasNext()){
            Card topCard = cardDeck.drawOne();
            System.out.println(++i + ": "  + topCard.getRank().getName() +" of " + topCard.getSuit().getName());
        }


    }
}
