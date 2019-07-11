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
public class SuperPower implements Power{

    @Override
    public String description() {
        return "super power";
    }

    @Override
    public double cost() {
        return 10.00;
    }
    
}
