/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerace;

/**
 *
 * @author matthew cooke
 */
class Summer implements Season {

    @Override
    public void nextSeason(SeasonContext seasonContext) {
      System.out.println("Summer Season is running");
      //Based on condition season state changes 
      seasonContext.setSeason((Season) new Monsoon());
    }
    
}
