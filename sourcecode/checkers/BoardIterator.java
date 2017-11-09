/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

/**
 * Iterator for the BoardList class.
 */
public class BoardIterator {
   private BoardList boardList;
   private int current;
   
   public BoardIterator(BoardList boardList) {
      this.boardList = boardList;
      current = 0;
   }


   public boolean hasNext() {
      return (current < boardList.size());
   }
   
   
   public Board next() {
      return boardList.get(current++);
   }  
}

/**
 *
 * @author Administrator
 */
