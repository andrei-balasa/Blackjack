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
public class RandomBJ{
    Random r;
    
    public int getRandom(){
       r = new Random();
       return r.nextInt(14);
    }
}
