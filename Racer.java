/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerace;

import java.util.Random;

/**
 *
 * @author matty
 */
public class Racer {

    String Name;
    String CarName;
    int CarNum;
    int DistTravelled;

    public Racer(String TheName, String TheCarName, int TheCarNum) {
        DistTravelled = 0;
        Name = TheName;
        CarName = TheCarName;
        CarNum = TheCarNum;
    }

    public boolean Update() {
        Random rand = new Random();
        int aNum = rand.nextInt(20);

        this.DistTravelled += aNum;

        return this.DistTravelled > 100;
    }

    public void DisplayInfo() {
        System.out.println(Name + " " + CarName + " " + CarNum);
    }

    public void DisplayCar() {
        for (int i = 0; i < this.DistTravelled; i++) {
            System.out.print(".");
        }
        System.out.println("<[--" + CarName + "--]>");

    }

}
