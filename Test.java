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
public class Test {
    public static void main(String [] args){
//       Deck deck = new Deck();
//       deck.newDeck();
//       for(int x : deck.card)
//            System.out.print(x+" ");     
//        
//       System.out.println();
//
//       Hand hand  = new Hand();
//       hand.addCard(deck);
//       hand.addCard(deck);
//       hand.addCard(deck);
//       hand.addCard(deck);
//       hand.addCard(deck);
//       for(int x : hand.card){
//           if (x != 0)
//               System.out.print(x+" ");
//       }
//       
//       System.out.println();
//       
//       for(int x : deck.card)
//            System.out.print(x+" "); 
       
       
       
       Deck d = new Deck();
       for(int x : d.card)
            //if(x != 0)    
                System.out.print(x+" "); 
       
       System.out.println();
       
       Player p  = new Player();
       p.hand.addCard(d);
       p.hand.addCard(d);
       p.hand.addCard(d);
       
       Player p1  = new Player();
       p1.hand.addCard(d);
       p1.hand.addCard(d);
       p1.hand.addCard(d);
       
       
       for(int x : p.hand.card)
            if(x != 0)    
                System.out.print(x+" "); 
       
       System.out.println();
       System.out.println(p.hand.getSum());
       
       for(int x : p1.hand.card)
            if(x != 0)    
                System.out.print(x+" "); 
       
       System.out.println();
       System.out.println(p1.hand.getSum());
       
       for(int x : d.card)
            //if(x != 0)    
                System.out.print(x+" "); 
       
       
       
    }
}
