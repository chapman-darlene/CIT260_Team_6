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
import byui.cit260.viewLayer.StartProgramView;

/**
 *
 * @author DC with the help of rledesma.
 *
 */
public class Main {
    
    private static Game currentGame = null;
    private static Player Player = null;
    
    public static void main(String[] args){
        
       //call constructor function and instantiate object
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
             
    }

     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Main.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return Player;
    }

    public static void setPlayer(Player Player) {
        Main.Player = Player;
    }
    
    
}
