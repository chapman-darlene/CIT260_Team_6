/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.controlLayer;

import byui.cit260.game.model.Crops;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DC
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcLandCost method, of class CropsControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("***calcLandCost Test***");
        int min = 17;
        int max = 26;
        int result = CropsControl.calcLandCost();
        assertTrue(min <= result && max >= result); 
        //System.out.println(result);
    }
    
    @Test
    public void testBuyLandOne(){  

        System.out.println("***buyLand Test 1***");

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
        //System.out.println(result);     
    }   

    @Test
    public void testBuyLandTwo(){  

        System.out.println("***buyLand Test 2***");

        // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = -5;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result;
        result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
         //System.out.println(result);
        }      

    @Test
    public void testBuyLandThree(){  

        System.out.println("***buyLand Test 3***");

        // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = 200;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result;
        result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testBuyLandFour(){  

        System.out.println("***buyLand Test 4***");

        // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = 140;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = 0;
        int result;
        result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testBuyLandFive(){  

        System.out.println("***buyLand Test 5***");

        // we need a crops object with the following values filled in
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);

        int toBuy = 0;
        int landCost = 20;
        CropsControl instance = new CropsControl();
        int expResult = 2800;
        int result;
        result = instance.buyLand(theCrops, toBuy, landCost);
        assertEquals(expResult, result);
        //System.out.println(result);
    }

    @Test
    public void testSellLandOne() {
    // we need a crops object with the following values filled in
        System.out.println("***sellLand Test 1***");
        
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = 5;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = 2050;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
        //System.out.println(result);
    }
    
    @Test
    public void testSellLandTwo() {
    // we need a crops object with the following values filled in
        System.out.println("***sellLand Test 2***");
        
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = -1;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
        //System.out.println(result);
    }
    
    @Test
    public void testSellLandThree() {
    // we need a crops object with the following values filled in
        System.out.println("***sellLand Test 3***");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = 105;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
        //System.out.println(result);
    }
    
    @Test
    public void testSellLandFour() {
    // we need a crops object with the following values filled in
        System.out.println("***sellLand Test 4***");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = 99;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = 2990;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
        //System.out.println(result);
    }
    
    @Test
    public void testSellLandFive() {
    // we need a crops object with the following values filled in
        System.out.println("***sellLand Test 5***");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2000);
        theCrops.setAcres(100);

        int toSell = 0;
        int landCost = 10;
        CropsControl instance = new CropsControl();
        int expResult = 2000;
        int result = instance.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
        //System.out.println(result);
    }
    

    @Test
    public void testPayPharaohOne(){
       System.out.println("***payPharaoh Test 1***");
       Crops theCrops = new Crops();
       theCrops.setWheatInStore(300);
       double percentToPharaoh = .10;

       CropsControl instance = new CropsControl ();
       int expResult = 270;

       int result = instance.payPharaoh(theCrops, percentToPharaoh);
       assertEquals(expResult, result);
       //System.out.println(result);
    }
    
    @Test
    public void testPayPharaohTwo(){
       System.out.println("***payPharaoh Test 2***");
       Crops theCrops = new Crops();
       theCrops.setWheatInStore(1);
       double percentToPharaoh = .10;

       CropsControl instance = new CropsControl();
       int expResult = -1;

       int result = instance.payPharaoh(theCrops, percentToPharaoh);
       assertEquals(expResult, result);
       //System.out.println(result);
    }

    @Test
    public void testCalcNewPeople(){
        System.out.println("***calcNewPeople Test***");
        Crops theCrops = new Crops();
        int min = 1;
        int max = 15;
        CropsControl instance = new CropsControl();
        int result = instance.calcNewPeople(theCrops);
        assertTrue(min <= result && max >= result); 
        System.out.println(result);
    }


    @Test
    public void testGrowPopulationOne(){
        System.out.println("***GrowPopulation Test 1***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(100);
        theCrops.setNumberWhoDied(0);
        theCrops.setNewPeople(5);

        int expResult = 105;
        CropsControl instance = new CropsControl();
        int result = instance.growPopulation(theCrops);
        assertEquals(expResult, result);

        //System.out.println(result);
    }
    
    @Test
    public void testGrowPopulationTwo(){
        System.out.println("***GrowPopulation Test 2***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(100);
        theCrops.setNumberWhoDied(10);
        theCrops.setNewPeople(0);

        int expResult = -1;
        CropsControl instance = new CropsControl();
        int result = instance.growPopulation(theCrops);
        assertEquals(expResult, result);

        //System.out.println(result);
    }
    
    @Test
    public void testGrowPopulationThree(){
        System.out.println("***GrowPopulation Test 3***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(100);
        theCrops.setNumberWhoDied(9);
        theCrops.setNewPeople(1);

        int expResult = 92;
        CropsControl instance = new CropsControl();
        int result = instance.growPopulation(theCrops);
        assertEquals(expResult, result);

        //System.out.println(result);
    }
    
    @Test
    public void testGrowPopulationFour(){
        System.out.println("***GrowPopulation Test 4***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(100);
        theCrops.setNumberWhoDied(1);
        theCrops.setNewPeople(10);

        int expResult = 109;
        CropsControl instance = new CropsControl();
        int result = instance.growPopulation(theCrops);
        assertEquals(expResult, result);

        //System.out.println(result);
    }
    
    @Test
    public void testCalcStarvedOne(){
        System.out.println("***CalcStarved Test 1***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(100);
        theCrops.setWheatInStore(2800);
        theCrops.setFed(2000);

        CropsControl instance = new CropsControl();
        int expResult = 0;
        int result = instance.calcStarved(theCrops);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testCalcStarvedTwo(){
        System.out.println("***CalcStarved Test 2***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(150);
        theCrops.setWheatInStore(2800);
        theCrops.setFed(0);

        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result = instance.calcStarved(theCrops);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testCalcStarvedThree(){
        System.out.println("***CalcStarved Test 3***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(150);
        theCrops.setWheatInStore(2800);
        theCrops.setFed(3000);

        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result = instance.calcStarved(theCrops);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testCalcStarvedFour(){
        System.out.println("***CalcStarved Test 4***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(150);
        theCrops.setWheatInStore(3000);
        theCrops.setFed(3000);

        CropsControl instance = new CropsControl();
        int expResult = 0;
        int result = instance.calcStarved(theCrops);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
    @Test
    public void testCalcStarvedFive(){
        System.out.println("***CalcStarved Test 5***");
        Crops theCrops = new Crops();
        theCrops.setPopulation(150);
        theCrops.setWheatInStore(2800);
        theCrops.setFed(1);

        CropsControl instance = new CropsControl();
        int expResult = 150;
        int result = instance.calcStarved(theCrops);
        assertEquals(expResult, result);
        //System.out.println(result);
    }
    
}
