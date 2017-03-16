package com.tasks3.carddeck;

/**
 * Created by yurko on 16.03.17.
 */
public class Runner {
    public static void main(String[] args) {
        Deck cardDeck = new Deck();
        Card topCard = cardDeck.drawOne();
        System.out.println("TopCard" + "\nRank: " + topCard.getRank().getName() +"\nSuit: " + topCard.getSuit().getName());
        cardDeck.shuffle();
        topCard = cardDeck.drawOne();
        System.out.println("TopCard" + "\nRank: " + topCard.getRank().getName() +"\nSuit: " + topCard.getSuit().getName());

    }
}
