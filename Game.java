/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Yusuf Aldaly
 */
public class Game {
        private byte choice;
        private byte turn;
        private Board board;
        private Player []player = new Player[2];
        
        
    
    public Game(){
        turn = 0;
    }
    
    public void displayMenu(){
        System.out.println("Welcome to FCAI CU Board Games");
        System.out.println("1. To play Tic Tac Toe");
        System.out.println("2. To play conect 4");
        System.out.println("3. To Exit");
        
        Scanner in = new Scanner(System.in);
       
        while(choice != 3){
            choice = in.nextByte();
            switch(choice){
                case 1:
                    createPlayer();
                    createGame((byte)1);
                    break;
                case 2:
                    createPlayer();
                    createGame((byte)2);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            displayMenu();
        }
        
    
    }
    
    private void createPlayer(){
        player[0] = new Player();
        player[1] = new Player();
        checkSymbol();
    }
    
    private void checkSymbol(){
        if(player[0].getSymbol() == player[1].getSymbol()){
            System.out.println("The two players can't have the same symbol, try again");
            createPlayer();
        }
        else
            return;
    }
    
    private void createGame(byte flag){
        if(flag == 1){
            board = new TicTacToeBoard();
            Scanner in = new Scanner(System.in);
            
            while(!board.isWinner() && turn != 9){
                for(byte i = 0; i < 2; i++){
                    board.displayBoard();
                    System.out.println(player[i].getName()+" Enter the position you want to play "+player[i].getSymbol()+" in:");
                    if(board.update(in.next().charAt(0), player[i].getSymbol())){
                        turn++;
                    }
                    else{
                        System.out.println("There is already a symbol here, try again");
                    }
                    if(board.isWinner()){
                        board.displayBoard();
                        System.out.println("Congratulations, "+player[i].getName()+" has won!!!");
                        System.out.println();
                        turn = 0;
                        break;
                    }
                    if(turn == 9){
                        board.displayBoard();
                        System.out.println("It's a DRAW, no one won!!!!!");
                        System.out.println();

                        break;
                    }

                }
            }
            turn = 0;
        }
        else if(flag == 2){
            return;
            //board = new Connect4Board();
        }
        
    }
    
}
        
    


