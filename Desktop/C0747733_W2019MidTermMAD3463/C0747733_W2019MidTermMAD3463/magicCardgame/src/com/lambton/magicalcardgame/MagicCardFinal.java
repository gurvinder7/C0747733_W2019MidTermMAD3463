/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.magicalcardgame;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class MagicCardFinal {

    public static void main(String[] args) {

        MagicalCardGameModel magicalcardgamemodel = new MagicalCardGameModel();
        Scanner scanner = new Scanner(System.in);
        //  System.out.println();

        String[][] cardList = {{"A", "4", "3"},
        {"K", "7", "2"},
        {"5", "9", "8"}};
        magicalcardgamemodel.setCardList(cardList);
        
       System.out.print( magicalcardgamemodel.getCardList());

    }

}
