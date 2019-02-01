/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.magicalcardgame;

/**
 *
 * @author macstudent
 */
public interface MagicGameInterface {

    public String[][]
            getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel);

    public String[][]
            getSecShuffleResult(MagicalCardGameModel magicalCardGameModel);

    public String
            getFinalResult(MagicalCardGameModel magicalCardGameModel);
}
