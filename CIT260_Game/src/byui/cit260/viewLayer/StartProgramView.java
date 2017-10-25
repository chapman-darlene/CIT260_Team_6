/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewLayer;

import byui.cit260.controlLayer.GameControl;
import java.util.Scanner;

/**
 *
 * @author DC
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){ //return void
        /* Bro Jackson Code
        //prompt for name
        this.promptMessage = "\nPlease enter your name";
        //call displayBanner method
        this.displayBanner();
        */
    }
    //create DisplayBanner method
    private void displayBanner() {
        //print out game description
        System.out.println("This is where the banner text will go");
    }

    public static void displayStartProgramView() {
        String playerName = getPlayerName();
        GameControl.createPlayer(playerName);
        
        GameControl.createCrops();
        
        System.out.println("\n\n\n");
        System.out.println(playerName + ", you have been appointed overseer for your"
                + "village. Tread carefully. If your people are not fed well,"
                + "you could lose your head.");
        
        displayNextView();
        
    }
    
    public static String getPlayerName(){
        String playerName = "";
        Scanner keyboard = new Scanner(System.in);
        
        do {
            //get player name
            System.out.print("Please enter your name: ");
            playerName = keyboard.nextLine();
            //trim blank space from name
            playerName = playerName.trim();
            //validate name
            if(playerName.length() < 2)
                System.out.println("Invalid input: name must be at least 2 characters");
        }while(playerName.length() < 2);
        
        return playerName;
    }

      
   public static void displayNextView(){
        MainMenuView.displayMainMenu();//need to create MainMenuView class.
        //where does it go?
        //control returns to this point when user exits main menu
        System.out.println("Goodbye....thanks for playing");
        
    }
   
}
