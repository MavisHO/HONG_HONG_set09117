/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.io.Serializable;

public abstract class Move implements Serializable{   
   protected Coordinate destination;
   protected CheckerPosition checker;
   protected Move next = null;
      
   public abstract boolean isJump();
   public abstract String toString();
   public abstract Move copy(Board newBoard);
   public abstract Move copy();
   
   
   public CheckerPosition getChecker() {
      return checker;
   }
   
   
   public Coordinate getDestination() {
      return destination;
   }


   // For the MoveList class.
   public void setNext(Move next) {
      this.next = next;   
   }
   
   
   // For the MoveList class.
   public Move getNext() {
      return next;
   }
}

/**
 *
 * @author Administrator
 */

