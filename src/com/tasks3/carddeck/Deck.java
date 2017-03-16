package com.tasks3.carddeck;

import java.util.LinkedList;

public class Deck {
    private final int SIZE = 36;
    private LinkedList<Card> cardList;

    public Deck() {
        cardList = new LinkedList();

        for (int suit = 0; suit < Suit.values.length; suit++) {
            for (int rank = 0; rank < Rank.values.length; rank++){
                cardList.add(new Card(Rank.values[rank], Suit.values[suit]));
            }
        }

    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Double randomCardIndex;
        Double numberOfShuffles = Math.random()*100+30;
        for (int i = 0; i < numberOfShuffles.intValue(); i++) {
            randomCardIndex =  Math.random()*SIZE;
            cardList.addLast(cardList.remove(randomCardIndex.intValue()));
        }
    }

    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return !cardList.isEmpty();
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()) {
            return cardList.getLast();
        }
        else
            return null;
    }
}

