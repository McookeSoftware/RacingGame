/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerace;

import gamerace.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matthew cooke
 */
public class CarName implements Subject { // implements Subject, implements all abstract methods from subject interface

    private String CarName;
    //Instance variables 

    private boolean available;

    private List<Observer> listofObservers = new ArrayList<Observer>(); //Instance variables 

    public boolean isAvailable() {
        return available;
    }
// Getter and Setter are then Created  

    public void setAvailable(boolean avaiable) {// if available notify the observer
        this.available = avaiable; 
        if (avaiable == true) {
            notifyObservers();
        } else {
        }
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public List<Observer> getListofObservers() {
        return listofObservers;
    }

    public void setListfObservers(List<Observer> listofObservers) {
        this.listofObservers = listofObservers;
    }

    //Implantation to all below methods with Observer parameter 
    @Override
    public void registerObserver(Observer observer) {
        listofObservers.add(observer);// adding Observer
    }

    @Override
    public void removeObserver(Observer observer) {
        listofObservers.remove(observer);//remover observer
    }

    @Override
    public void notifyObservers() {

        System.out.println("User Update"); //notifaction to the user for each Notification

        listofObservers.forEach((Observer observer) -> {
            observer.update(CarName); //
        });

    }

}
