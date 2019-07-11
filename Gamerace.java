/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerace;

import java.util.Scanner;

/**
 *
 * @author matty
 */
public class Gamerace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userGuess; // allows the user to see what car was picked at the end of the race 
        boolean stopNow = false; // stops the race

        System.out.println("Hello and welcome to the races");
        System.out.println("this is a racing Game the user must pick a car once a car is picked he race will start");
        System.out.println("the game has Weather condions so please pick carefully");
        System.out.println(" ");
        //instructions for the game
        Player player1 = new Player();
        player1.setPlayerName("Player");
        //Players Name
        CarName carname = new CarName();
        carname.setCarName("Cars");
        carname.setAvailable(false);
        // confirms if cars avaiblity

        carname.registerObserver(player1);
        //regisers the player
        carname.setAvailable(true);
        //notifys the player
        SeasonContext seasonContext = new SeasonContext();
        seasonContext.nextSeason();
        //connects to the state patten class which is used for the weather
        Power SuperPower = new SuperPower();
        SuperPower = new Boost(SuperPower);
        SuperPower = new Weapon(SuperPower);
        SuperPower = new JumpPower(SuperPower);
        //connects to the decorater patten which allows for the use of powers in the game
        System.out.println("Your car has super powers");
        System.out.println("Your cost for these powers are " + SuperPower.cost());
        //totals the cost for the powers 

        System.out.println("Press Enter to continue");

        try (Scanner scan = new Scanner(System.in) // Reading from System.in
                ) {

            scan.nextLine();
            // creates an imput to pause the game so user can read   
            System.out.println("---------------------------------------------");

            Racer[] leaderBoard = new Racer[7];

            leaderBoard[0] = new Racer("Sonic", "RingRacer", 01);
            leaderBoard[1] = new Racer("Goku", "Nibus", 02);
            leaderBoard[2] = new Racer("Trunks", "Time Capsule", 03);
            leaderBoard[3] = new Racer("Harry potter", "ninbus 2000", 04);
            leaderBoard[4] = new Racer("Ron", "Flying Car", 05);
            leaderBoard[5] = new Racer("Mario", "Kart", 06);
            leaderBoard[6] = new Racer("Iron Man", "The Bulletproof Car", 07);
            System.out.print("--------------------------------------------");
            // array list for the racers and cars which are used in the game
            for (int i = 0; i < 7; i++) {
                leaderBoard[i].DisplayInfo();
            }
            // displays racers information
            try (Scanner reader = new Scanner(System.in) // Reading from System.in
                    ) {

                System.out.println("Enter a number: ");
                userGuess = reader.nextInt(); // Scans the next token of the input as an int.
                //once finished

                userGuess--;
                //the race starts at 0 and have to take 1 off to make the correct number read out

                System.out.println("you have picked " + leaderBoard[userGuess].CarName);
                //prints what car was picked 
            }

            System.out.print("------------------------------");

//loop is created to run the game 
            while (!stopNow) {
                for (int i = 0; i < 7; i++) {
                    if (leaderBoard[i].Update()) {
                        for (int a = 0; a < 7; a++) {
                            if (leaderBoard[a].DistTravelled >= 100) { // how far the car have travelled 
                                leaderBoard[a].DisplayCar();
                                System.out.println(leaderBoard[a].CarName + " has won"); // prints what car won 
                            }
                        }
                        stopNow = true; // have the car reached the end for the race if so then stop
                        break;
                    }
                    if (!stopNow) {
                        leaderBoard[i].DisplayCar(); // display the winning car
                    }

                }
                System.out.print("------------------------------");
                System.out.println("");
                try {
                    Thread.sleep(1000); // slows down the applicaion 
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

            }

            System.out.println("you have picked " + leaderBoard[userGuess].CarName); //shows car the the user had guessed

            // leaderBoard[userGuess].setAvaiable(false);//
            seasonContext.nextSeason();// ones the race has ended the condistion changes to a diffrent season 

        }
    }
}
