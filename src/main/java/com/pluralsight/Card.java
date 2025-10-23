package com.pluralsight;

//this is what a card is made of (the suit, value of that card, whether is faced up or not.)

public class Card {
    private String suit;
    private String value;
    private  boolean isFaceUp;

    //CONSTRUCTOR (this is how to make a card)
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;

    }

    //GETTERS (this is how we get the information from a card.)

    public String getSuit(){
        if(isFaceUp){
            return suit;
        }
        else {
         return "#";
        }
    }



    public String getValue(){
        if(isFaceUp){
            return value;

        }
        else {
            return "#";
        }
    }


    public int getPointValue() {
        if (isFaceUp) {

            switch (value) {

                case "2":
                    return 2;

                case "3":
                    return 3;

                case "4":
                    return 4;

                case "5":
                    return 5;

                case "6":
                    return 6;

                case "7":
                    return 7;

                case "8":
                    return 8;

                case "9":
                    return 9;

                case "10", "K", "Q", "J":
                    return 10;

                case "A":
                    return 11;
            }


        }
        return 0;
    }

    //METHODS to change whether a cards status is faced up or down.

    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flipCard(){
        isFaceUp = ! isFaceUp;
         //x = y

    }


}

