/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.controlLayer;

import java.util.Random;
import byui.cit260.game.model.Crops;

/**
 *
 * @author DChapman
 */


public class CropsControl {
    
     //random number generator
    private static Random random = new Random();
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
        
     /*
    calcLandCost() method
    Purpose: Calculatea random land cost between 17 and 26 bushels/acre
    Parameters: none
    Return: landCost
    */ 
    public static int calcLandCost(){
       int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
       return landPrice;   
   }
    
    /*The Buy Land Method
    Purpose: To buy land
    Parameters: The price of land, the number of acres to buy, and a reference to the crops object
    Returns: The amount of wheat left in storage after the purchase
    Pre-conditions: 
        AcresToBuy buy must be positive
        BushelsInStore > (acresToBuy * price)
    */
    public int buyLand(Crops theCrops, int toBuy, int landCost){
    
        //if(acresToBuy < 0) return -1
                       
        if(toBuy < 1)
            return -1;
        
        //if((acresToBuy * landPrice) > wheatInStore) return -1
        int wheat = theCrops.getWheatInStore();
            if(wheat < toBuy * landCost)
                return -1;
        //acresOwned = acresOwned + acresToBuy
        int acres = theCrops.getAcres();
            acres += toBuy; // acres = acres + toBuy
            theCrops.setAcres(acres);
        
        //wheatInStore = wheatInStore - (acresToBuy * landPrice)
        wheat -= (toBuy * landCost);
        theCrops.setWheatInStore(wheat);
        
        // return wheatInStore
        return wheat;
    }
    
    /* Sell Land Method
    Purpose: To sell land
    Parameters: (price of land, wheat in store, acres owned, acres to sell)
    Returns: return acres and wheat in store -- Not sure how to do this!!!
    Pre-conditions: 
        Cannot sell more land than is available
        Acres to Sell cannot be less than zero
    */
    
    public int sellLand(Crops theCrops, int toSell, int landCost){
        					
    //if(acresToSell  < 0) return -1
    if(toSell < 0)
        return -1;
   
    int acres = theCrops.getAcres();
        if(toSell > acres)
        return -1;
    
    
    //else acresOwned = acresOwned - acresToSell
    acres = acres - toSell;
    theCrops.setAcres(acres);
            
     //wheatInStore = wheatInStore - (acresToBuy * landPrice)
     int wheat = theCrops.getWheatInStore();
        wheat = wheat + (toSell * landCost);
        theCrops.setWheatInStore(wheat);
        
        // return wheatInStore
        return wheat;     
    }  
    
}
