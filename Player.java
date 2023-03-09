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
public class Player {
    private String name = new String();
    private char symbol;
    
    
    public Player(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter player name: ");
        setName(in.nextLine());
        System.out.format("Enter %s Desired symbol(X or O): ", name);
        setSymbol(in.next().charAt(0));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        if((symbol != 'X') && (symbol != 'x') && (symbol != 'o') && (symbol != 'O')){
            System.out.println("Not a valid symbol, try again");
        }
        else{
            this.symbol = symbol;
        }
    }
    
    
    
}
