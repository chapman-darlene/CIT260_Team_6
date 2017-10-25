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
                       
        if(toBuy < 0)
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
    
    /*Feeding the People Method
    Purpose: set aside wheat from wheatInStore to feed the People
    Parameters: (wheatInStore, wheatToFedPeople)
    Returns: wheatInStore
    Pre-conditions: 
        Can't use a negative amount
        wheatInStore > wheatToFedPeople
    */
    public int feedPeople(Crops theCrops, int wheatToFeedPeople){
        					
    /*String question = "How many bushels of grain do you want to give to the people? ";
    int wheatToFedPeople = getNumber(question);
    
    int wheatInStore = theCrops.getWheatInStore();
	
    if(wheatToFedPeople < 0) 
        return -1;
    
    if(wheatToFedPeople > wheatInStore) 
        return -1;
    //else wheatInStore = wheatInStore - wheatToFedPeople
    wheatInStore = wheatInStore - wheatToFedPeople;
    theCrops.setWheatInStore(wheatInStore);
            
     
     int wheat = theCrops.getWheatInStore();
         theCrops.setWheatInStore(wheat);
    // return wheatInStore
        return wheat;     
    }*/
    int wheat = theCrops.getWheatInStore();
    //if(wheatToFedPeople > wheatInStore) return -1
    if(wheatToFeedPeople > wheat)
        return -1;
    
    //if (wheatInStore < 20) return -1
    if(wheatToFeedPeople < 0)
        return -1;
						
    wheat = wheat - wheatToFeedPeople;
    theCrops.setWheatInStore(wheat);
    return wheat;					
    }
    
/*Planting Acres Of Land
    Purpose: set aside the amount of land and wheat to plan
    Parameters: (wheatInStore, acresToPlant)
    Returns: wheatInStore
    Pre-conditions: 
        Can't use a negative amount
        wheatInStore > wheatToPlant
    */
    public int plantCrops(Crops theCrops, int acresToPlant){
        					
        //String question = "How many acres of land do you want to plant? ";
        //int acresToPlant = getNumber(question);
        int wheatInStore = theCrops.getWheatInStore();
            int acres = thecrops.getAcres();

        if(acresToPlant < 0) 
            return -1;

            if(acresToPlant > acres) 
            return -1;

        if(wheatInStore < acresToPlant / 2) 
            return -1;

            int wheatToPlant = acresToPlant / 2; 
            wheatInStore = wheatInStore - wheatToPlant;
        theCrops.setWheatInStore(wheatInStore);


         int wheat = theCrops.getWheatInStore();
             theCrops.setWheatInStore(wheat);
        // return wheatInStore
            return wheat; 
            */
    
    
    }
    
    
    
    /*Pay Pharaoh Method
    Purpose: To pay 8% of wheatInStore to Pharaoh
    Parameters: (wheatInStore, percentageToPharaoh)
    Returns: wheatInStore
    Pre-conditions: 
        Can't pay Pharaoh a negative amount
        wheatInStore > Pharaoh's amount
        Have to Force percentage (double) into an int
    */
    public int payPharaoh(Crops theCrops, double percentToPharaoh){
        //define pharaoh's share
        int paidToPharaoh;
        int wheat = theCrops.getWheatInStore();
        //cannot pay pharaoh less than one -- not enough wheat
        if(wheat <= 9)
            return -1;
        //determine amount to pay to Pharaoh
        //subtract amount paidToPharaoh from wheatInStore
        paidToPharaoh = (int) (percentToPharaoh * wheat);
        //System.out.println(paidToPharaoh);
        wheat = wheat - paidToPharaoh;
        //System.out.println(wheat);
        theCrops.setWheatInStore(wheat);
        return wheat;
    }
    
    //Calculate Random New People Moving In 
    private static final int NEW_PEOPLE_IN = 5;
    private static final int NEW_PEOPLE_IN_RANGE = 10;
 
    public int calcNewPeople(Crops theCrops){
       int people = random.nextInt(NEW_PEOPLE_IN) + NEW_PEOPLE_IN_RANGE; 
       theCrops.setNewPeople(people);
       //System.out.println(people);
       return people;
    }
    
    /*Grow Population Method
    Purpose: Determine number of new people added to population
    Parameters: (theCrops)
    Returns: population
    Pre-conditions: 
        if numberWhoDied is greater than 10, return -1
    */
    public int growPopulation(Crops theCrops){
        //Determine number who died
        int peopleDead = theCrops.getNumberWhoDied();
        //int newPersons = theCrops.getNewPeople();
        if(peopleDead >= 10)
            return -1;
        //get Random number of new movings
        int newPersons = theCrops.getNewPeople();
        //Add number of MoveIns to Population Total
        int population = theCrops.getPopulation();
        int newPopulation = (population + newPersons) - peopleDead;
        theCrops.setPopulation(newPopulation);
        //return the number of new Population
        return newPopulation;
    }

    
    /*Calc Starved Method
    Purpose: Determine how many died due to starvation
    Parameters: (theCrops, wheatPerPerson)
    Returns: population
    Pre-conditions: 
        Can't feed people zero
        Have to have enough wheatInStore
    */
    
    private static final int WHEAT_PER_PERSON = 20;
    
    public int calcStarved(Crops theCrops){
        int wheatPerPerson = WHEAT_PER_PERSON;
        int people = theCrops.getPopulation();
        int wheat = theCrops.getWheatInStore();
        int wheatFed = theCrops.getFed();
        
        
        //if (fed< 0) return -1 (Error "Can't feed negative amount of food to people)
        if(wheatFed <=0)
            return -1;
        //if(wheatInStore < fed) return -1 (Error: Not Enough Grain)					
	if(wheat < wheatFed)
            return -1;
        //needFoodAmt = wheatPerPerson * population
        int neededFood = wheatPerPerson * people;
        
        //wheatInStore = wheatInStore - fed	
        wheat = wheat - wheatFed;
        theCrops.setWheatInStore(wheat);
        //numberWhoDied = population - (fed/wheatPerPerson)
        int peopleDead = people - (wheatFed/wheatPerPerson);
        theCrops.setNumberWhoDied(peopleDead);
        //System.out.println(peopleDead);
        //return = numberWhoDied
        return peopleDead;
    }
    
   
}
