/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewLayer;

import GamePackage.Main;
import byui.cit260.controlLayer.GameControl;
import java.util.Scanner;

/**
 *
 * @author DC
 */
public class MainMenuView { 
    
    private String menu;
    private static final int MAX = 6;
    
    
    public MainMenuView(){
        this.menu = "\n"
                + "\n-----------------------------------------------------------"
                + "  |Main Menu"
                + "\n-----------------------------------------------------------"
                + "\n1 -- Start New Game"
                + "\n2 -- Get and Start a Saved Game"
                + "\n3 -- Get Help on How to Play Game"
                + "\n4 -- Save Game"
                + "\n5 -- Quit"
                + "-------------------------------------------------------------";
        
      
    }
   

    public void displayMainMenuView() {
        
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
                this.startNewGame();
                break;
            case 2:
                this.startExistingGame();
                break;
            case 3:
                this.displayHelpMenu();
                break;
            case 4:
                this.saveGame();
                break;
            case 5:
                this.quitGame();
                break;
            default:
                System.out.println("\n** Invalid Selection. Try Again **");
                break;
                
        }
        return inputValue;
    }

    private void startNewGame() {
        //System.out.println("The startNewGame() Method goes here");
        GameControl.createNewGame(Main.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("The startExistingGame() Method goes here");
    }

    private void displayHelpMenu() {
        System.out.println("The displayHelpMenu() Method goes here");
    }

    private void saveGame() {
        System.out.println("The saveGame() Method goes here");
    }

    private void quitGame() {
        System.out.println("The quitGame() Method goes here");
    }
    
   

}//end Main View