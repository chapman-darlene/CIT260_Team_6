/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.controlLayer;

import byui.cit260.game.model.Crops;
import byui.cit260.controlLayer.CropsControl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author DC
 */
public class DebryTest {
    

/**
 *
 * @author DC
 */

@Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int min = 17;
        int max = 26;
        int result = CropsControl.calcLandCost();
        assertTrue(min <= result && max >= result);    
    }
    
@Test
public void testBuyLand(){  
    
        System.out.println("** buyLand test case 1 **");
        
        // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = 10;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = 2600;
        int result;
        result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
    }

 @Test
    public void testSellLand() {
    // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = 5;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = 2050;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result);        
    }


}