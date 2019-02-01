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
public class MagicalCardGameCalculator extends MagicalCardGameModel {
    
   String firstcolumn[][]= new String[3][3];
    
public void  firstColomn(){
    
    
    for(int i=0;i<3;i++){
        
        for(int j=0;j<3;j++){
                       
            firstcolumn[i][j]=cardList[i][j];
            break;
                
        }
        
        for(int k=0;k<cardList.length;k++){
                       
           firstcolumn[i][k]=cardList[k][i-1];
           break;
                
      }
       for(int l=3;l>cardList.length;l--){
                       
            firstcolumn[i][l-2]=cardList[l][i];
            break;
                
        }
    
    
    }
    
}

    public void cardListDisplay1() {
        
        for (int i=0;i<firstcolumn.length;i++){
            
        for(int j=0;j<firstcolumn.length;j++){
        System.out.print(firstcolumn[i][j]);
        
        }
        System.out.println();
        
        }
           

    }

    
}
