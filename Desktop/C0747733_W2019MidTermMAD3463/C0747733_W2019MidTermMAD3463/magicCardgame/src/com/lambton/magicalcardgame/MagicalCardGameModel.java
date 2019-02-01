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
public class MagicalCardGameModel implements MagicGameInterface {

    String firstShuffleColPos;
    String secShuffleColPos;
    String[][] cardList = null;
    String[][] firstShuffle = null;
    String[][] secShuffle = null;
    String guessedCard;

    public String getFirstShuffleColPos() {
        return firstShuffleColPos;
    }

    public void setFirstShuffleColPos(String firstShuffleColPos) {
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }

    public void setCardList(String[][] cardList) {
        this.cardList = cardList;
    }

    public String[][] getFirstShuffle() {
        return firstShuffle;
    }

    public void setFirstShuffle(String[][] firstShuffle) {
        this.firstShuffle = firstShuffle;
    }

    public String[][] getSecShuffle() {
        return secShuffle;
    }

    public void setSecShuffle(String[][] secShuffle) {
        this.secShuffle = secShuffle;
    }

    public String getGuessedCard() {
        return guessedCard;
    }

    public void setGuessedCard(String guessedCard) {
        this.guessedCard = guessedCard;
    }

    public void cardListDisplay() {
        
        for (int i=0;i<cardList.length;i++){
            
        for(int j=0;j<cardList.length;j++){
        System.out.print(cardList[i][j]);
        
        }
        System.out.println();
        
        }
           

    }

    @Override
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {

        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
    
        
    }

    @Override
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
