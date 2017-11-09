/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

/**
 * Iterator for the MoveList class.
 */
public class MoveIterator {
   private MoveList moveList;
   private int current;
   
   public MoveIterator(MoveList moveList) {
      this.moveList = moveList;
      current = 0;
   }


   public boolean hasNext() {
      return (current < moveList.size());
   }
   
   
   public Move next() {
      return moveList.get(current++);
   }  
}

/**
 *
 * @author Administrator
 */

