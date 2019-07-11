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
public class Weapon extends MorePowers {

     public Weapon (Power power) {
        
        this.power = power;
    }

    
    
    
    @Override
    public String description() {
      return "Weapon";  
    }


    @Override
    public double cost() {
       return power.cost() + 1.5;
    }
    
}

    

