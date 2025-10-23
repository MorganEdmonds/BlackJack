package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hand {

    // What our cards are collected in.

    private ArrayList<Card> cards;



    // Our hands our empty.
    public Hand(){
      cards = new ArrayList<>();
    }

    // This is the deal method that will deal our cards.
    // take one card from the arrayList and deal it.
    // Card is delt to the hand and the hand and oversees it.


    public void Deal(Card card){
        cards.add(card);
    }

    //Check to see how many cards are in my Hand
    public int getSize(){
        return cards.size();
    }

}

