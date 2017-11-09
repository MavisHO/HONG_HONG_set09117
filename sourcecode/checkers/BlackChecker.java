/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import javax.swing.ImageIcon; 
import java.net.URL;


/**
 *
 * @author Administrator
 */

public class BlackChecker extends CheckerPosition {

   public BlackChecker(Coordinate c) {
      checkerState = new NormalStateBlack();
      position = c;
      value = BLACK_VALUE_NORMAL;
      stringRep = "X";
   }
     
   
   public int getColor() {
      return BLACK;
   }
   
   
  
   
   
   public void makeKing() {
      checkerState = new KingState();
      value = BLACK_VALUE_KING;
      stringRep = "B";
   }
   
   
   public boolean isKing() {
      return (value == BLACK_VALUE_KING);
   }
   
     
   public boolean kingRow() {
      return ( (position.get() >= 29) && (position.get() <= 32) );
   }
   
   
   public CheckerPosition copy() {
      CheckerPosition newChecker = new BlackChecker(position);
      if (value == BLACK_VALUE_KING)
         newChecker.makeKing();
      return newChecker;
   }          

    @Override
    public ImageIcon getIcon() {
        return  null;
    }
}


