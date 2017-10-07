/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePackage;

import byui.cit260.game.model.Crops;
import byui.cit260.game.model.Game;
import byui.cit260.game.model.Location;
import byui.cit260.game.model.Player;
import byui.cit260.game.model.Map;
import byui.cit260.game.model.InventoryItem;

/**
 *
 * @author DC with the help of rledesma.
 *
 */
public class GameMain {
    
    public static void main(String[] args){
        
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
                
        String playerOneName = playerOne.getName(); 
        double playerOneTime = playerOne.getBestTime();
        
        System.out.println("Name = " + playerOneName + ", time = " + playerOneTime);
        
        System.out.println(playerOne.toString());
    }
    
}
