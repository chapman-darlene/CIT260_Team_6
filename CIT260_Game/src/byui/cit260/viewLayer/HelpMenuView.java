/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewlayer;

import GamePackage.Main;
import byui.cit260.controlLayer.GameControl;
import java.util.Scanner;

/**
 *
 * @author rledesma
 */
public class HelpMenuView {
    
    
    
    private String menu;
    private static final int MAX = 7;
    
    
    public HelpMenuView(){
        this.menu = "\n"
                + "\n-----------------------------------------------------------"
                + "  |Help Menu"
                + "\n-----------------------------------------------------------"
                + "\n1 -- What are the goals of the game?"
                + "\n2 -- Who is Joseph of Egypt?"
                + "\n3 -- How do I view the map?"
                + "\n4 -- How do I move to another location?"
                + "\n5 -- How do I display a list of provisions and tools in the Pharaoh’s storehouse?"
                + "\n6 -- Back to the Main Menu"
                + "-------------------------------------------------------------";
    
    
}

public void displayHelpMenuView() {
        
        int option;
        int inputValue;
       
            System.out.println(menu);
            option = getMenuOption();
            inputValue = option;
           
            inputValue = doAction(inputValue);
        
    }

private int getMenuOption(){
        int inputValue = 0;
        Scanner keyboard = new Scanner(System.in);
        do
        {
          System.out.print("Please enter an option:");
          inputValue = keyboard.nextInt();
          //inputValue = doAction(inputValue);
          if(inputValue < 1 || inputValue >= MAX)
          {
              System.out.println("Error: invalid option.");
          }
        } while(inputValue < 1 || inputValue >= MAX);
        
        return inputValue;
        
    }

public int doAction(int inputValue) {
        inputValue = getMenuOption();
        switch(inputValue){
            case 1: // Start a New Game
                this.goalsGame();
                break;
            case 2:
                this.whoIsJoseph();
                break;
            case 3:
                this.viewMap();
                break;
            case 4:
                this.moveToLocation();
                break;
            case 5:
                this.displayStorehouse();
                break;
            case 6:
                this.displayMainMenu();
                break;
            default:
                System.out.println("\n** Invalid Selection. Try Again **");
                break;
                
        }
        return inputValue;
    }


    private void goalsGame() {
        //System.out.println("The goalsGame() Method goes here");
       /* GameControl.createNewGame(Main.getPlayer());
        byui.cit260.viewLayer.GameMenuView gameMenu = new byui.cit260.viewLayer.GameMenuView();
        gameMenu.displayMenu();*/
    }

    private void whoIsJoseph() {
        System.out.println("The whoIsJoseph() Method goes here");
    }

    private void viewMap() {
        System.out.println("The viewMap() Method goes here");
    }

    private void moveToLocation() {
        System.out.println("The moveToLocation() Method goes here");
    }

    private void displayStorehouse() {
        System.out.println("The displayStorehouse() Method goes here");
    }
    
    private void displayMainMenu() {
        System.out.println("Goodbye...Back to the Main Menu.");
    }
    
}