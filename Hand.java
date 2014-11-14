/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author SAM
 */
public class Hand {
    int cardN = 0;
    int[] card = new int[52];
    
    
    //Adaugare carte
    public void addCard(Deck d){
        
        this.card[cardN] = d.getCard();
        this.cardN++;
        
    }
    
    public int getSum(){
        int s = 0;
        for(int x : this.card)
            s = s + x;
        return s;
    }
}
