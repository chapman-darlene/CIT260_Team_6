/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.game.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author DC
 */
public class Map implements Serializable {
    
    private int rowCount;
    private int colCount;
    private ArrayList<Location> locations = new ArrayList<Location>();

    public Map() {
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
    
    
}
