/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.timeout;

/**
 *
 * @author carlos
 */
public class TimeOut {
    public static void symbols(String symbol, int repeats){
        try {
            System.out.print("-*-");
            for (int i = repeats; i > 0; i--) {
                System.out.print(symbol);
                Thread.sleep(1000);
            }
            System.out.println("");//Añade un salto de línea
        } catch (InterruptedException ie) {
            System.out.println("Congrats! You've found a bug!");
        }
    }
}
