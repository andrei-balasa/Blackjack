/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;

/**
 *
 * @author SAM
 */
public class Deck {
    int[] card = new int[52];
    int cardN = 51;
    public Deck(){
        for(int i = 0; i<=12; i++){
            card[i] = i+1;
            card[i+13] = i+1;
            card[i+26] = i+1;
            card[i+39] = i+1;
            
        }
        this.shuffleDeck(this.card);
    }
    
    
     
   //Ia carte din deck 
   public int getCard(){
       int p = this.card[this.cardN];
       this.card[this.cardN] = 0;
       this.cardN--;
       return p;
       
   }
   
   //Functie suffle
   public void shuffleDeck(int[] ar)
  {
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
