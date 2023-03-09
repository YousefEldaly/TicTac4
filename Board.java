/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.GridLayout;

/**
 *
 * @author Yusuf Aldaly
 */
public abstract class Board {
    protected byte boardSize;
    protected char [][]grid;

    public Board(byte n){
        boardSize = n;
    }
    //public abstract void updateBoard(int position, char symbol);
    public abstract void displayBoard();
    public void setGrid(){
        grid = new char[boardSize][boardSize];
        byte val = 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = (char)(val + '0');
                val++;
            }
        }
    }
    
    public abstract boolean isWinner();
    
    
    public boolean update(char num, char symbol){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                if(grid[i][j] == num){
                    grid[i][j] = symbol;
                    return true;
                }
            }
        }
        return false;
    }

    };
 
    //public abstract boolean isDraw();
    