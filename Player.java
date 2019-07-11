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
public class Player implements Observer {


    private String playerName;
    private Subject subject;
        
    
    
    
    
    
    public String getPlayerName() {
        return playerName;
    
        
        }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void update(String carName) {
      
        System.out.println("Hello " + playerName + ", "+ carName + "is CarName is ready" );
    }
    
}
