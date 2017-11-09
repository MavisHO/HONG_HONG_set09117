/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

/** 
 * State pattern for the metods findValidMoves and findValidJumps in class Checker.
 * The two methods delegate the methods to a CheckerState object that can either
 * be NormalStateWhite, NormalStateBlack or KingState. This way an checker can
 * change state when it becomes a king.
 */
public interface CheckerState {    
   public boolean findValidMoves(CheckerPosition checker, Board board, 
                              MoveList validMoves);

   public boolean findValidJumps(CheckerPosition checker, Board board,
                              MoveList validJumps);
}

/**
 *
 * @author Administrator
 */

