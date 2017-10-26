/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewLayer;

import byui.cit260.game.model.Crops;
import byui.cit260.game.model.Game;
import byui.cit260.controlLayer.CropsControl;
import java.util.Scanner;

/**
 *
 * @author DC
 */
public class CropsView {
    //code from DeBry
    private static Scanner keyboard = new Scanner(System.in);
    
    private static Game theGame = Game.getGame();
    private static Crops theCrops = Game.getCrop();

    public static void buyLandView(){
        //call crops class
        
       int toBuy = 0;
       int price = CropsControl.calcLandCost();
       System.out.format("Land is selling for %d bushels per acre.%n",price);
               
       int wheat = theCrops.getWheatInStore();
       //int population = theCrops.getPopulation();
       
       do
        {
           System.out.print("\nHow many acres of land do you wish to buy? ");      
           toBuy = keyboard.nextInt();

              if(toBuy < 0) {
                 System.out.println("I am sorry master, I cannot do this.");
                 System.out.println("You cannot buy a negative amount of land.");
              }
              else if (toBuy * price > wheat){
              System.out.println("I am sorry master, I cannot do this.");
              System.out.println("You do not have enough wheat to buy this much land.");
              }
              
       } while(toBuy < 0 || toBuy * price > wheat);
       
       CropsControl.buyLand(theCrops, toBuy, price);
    }
    
}
