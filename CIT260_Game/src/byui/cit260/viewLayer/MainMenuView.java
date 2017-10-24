/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.viewLayer;

import java.util.Scanner;

/**
 *
 * @author DC
 */
class MainMenuView {

    private static int MAX;
    
    static void displayMainMenu() {
        System.out.println("**The displayMainView() method goes here**");
    }
    
    public static int getMenuOption(){
        int inputValue = 0;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.print("Please enter an option: ");
            inputValue = keyboard.nextInt();
            if(inputValue < 1 || inputValue > MAX)
                System.out.println("Error: invalid option.");
          } while(inputValue <1 || inputValue > MAX);
            return inputValue;
    }
}
 
