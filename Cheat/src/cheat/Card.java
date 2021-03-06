/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

/**
 *
 * @author Patrick
 */
public class Card implements Comparable{
    private String suit;
    private int value;
    private String imageValue;
    private boolean selected;

    /**
     * @param suit
     * @param value
     */
    public Card(String suit, int value, String imageValue){
        this.suit = suit;
        this.value = value;
        this.imageValue = imageValue;
        this.selected = false;
    }
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the imageValue
     */
    public String getImageValue() {
        return imageValue;
    }

    /**
     * @param imageValue the imageValue to set
     */
    public void setImageValue(String imageValue) {
        this.imageValue = imageValue;
    }
    public boolean getSelected() {
        return selected;
    }
    
        public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public int compareTo(Object t) {
        if(this.value == ((Card)t).getValue()){
            return 0;
        }else if (this.value > ((Card)t).getValue()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
