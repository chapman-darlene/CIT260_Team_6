/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewLayer;

import byui.cit260.controlLayer.GameControl;
import byui.cit260.game.model.Player;
import java.util.Scanner;

/**
 *
 * @author DC
 */
public class StartProgramView {
    
    //private String promptMessage;
    
    public StartProgramView(){ //return void
        //Bro Jackson Code
        //prompt for name
        //this.promptMessage = "\nPlease enter your name";
        //call displayBanner method
        this.displayBanner();
        
    }
    //create DisplayBanner method
    private void displayBanner() {
        //print out game description
        System.out.println("Welcome to Pharaoh’s court. You have been summoned " 
                + "here to assume your new role as Agricultural Overseer. "
                + "You report directly to Joseph, Pharaoh’s Vizier. Your "
                + "responsibility is to gather the grain from the harvest, "
                + "provide enough food to the people so they do not go hungry, "
                + "and reserve the rest in Pharaoh’s granary in preparation for "
                + "the prophesied famine that is to come in seven years." 
                + "\nYou need to know how to plant crops, develop land, feed the "
                + "people and store the excess. If you fail to provide enough "
                + "food for the people, the people will starve. Some people will"
                + " die. Your workforce will be diminished, and you will not "
                + "have enough workers to plant and harvest crops. Pharaoh will "
                + "not be pleased with those who fail him. Those who fail are "
                + "thrown in prison. He's not very nice to prisoners -- just "
                + "ask the Royal Baker. Oh, you can't because he's not around "
                + "anymore,RIP. Be wise and you will be successful");
    }

    public void displayStartProgramView() {
        String playerName = getPlayerName();
        GameControl.createPlayer(playerName); 
        
        System.out.println(playerName + ", we hope you enjoy the game.");
        
        GameControl.createCrops();
        
        System.out.println("\n\n"
                + "As the overseer for your village, you need to make sure all "
                + "are well fed. If you do not, you may lose your head!");
        
        displayNextView();
    }
    
    public String getPlayerName(){
        Scanner keyboard = new Scanner(System.in);
        String playerName = "";
        
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

      
   public void displayNextView(){
         
        MainMenuView mainMenuView = new MainMenuView();//need to create MainMenuView class.
        mainMenuView.displayMainMenuView();
        
       
        
  }
   
}

   