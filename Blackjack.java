/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author SAM
 */
public class Blackjack {
    public static void main(String [] args){
        int p = 0;
        int i = 0;
        
        System.out.println("Incepe jocul. Apasa 1 pentru a incepe, 0 pentru a iesi.");
        
        while(p!=1){
            Scanner keyboard = new Scanner(System.in);
            i = keyboard.nextInt();
            if(i == 1 || i ==0)
                p = 1;
        }
        
        if(i == 1){
            Game game = new Game();
            game.start();
        }else{
            System.out.println("La revedere!");
        }
      
        
    }
}
