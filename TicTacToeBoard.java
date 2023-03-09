/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;


/**
 *
 * @author Yusuf Aldaly
 */
public class TicTacToeBoard extends Board{
    public TicTacToeBoard(){
        super((byte)3);
        super.setGrid();
    }
    
    @Override
    public void displayBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + grid[0][0] + " | "
                           + grid[0][1] + " | " + grid[0][2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + grid[1][0] + " | "
                           + grid[1][1] + " | " + grid[1][2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + grid[2][0] + " | "
                           + grid[2][1] + " | " + grid[2][2]
                           + " |");
        System.out.println("|---|---|---|");
    }
    
    
    public boolean isWinner(){
        if (grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2])
            return true;
        else if (grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2])
            return true;
        else if (grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2])
            return true;
        else if (grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0])
            return true;
        else if (grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1])
            return true;
        else if (grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2])
            return true;
        else if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2])
            return true;
        else if (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0])
            return true;
        else
            return false;
    }
}
