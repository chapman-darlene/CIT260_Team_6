/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.game.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DChapman
 */
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    //private ArrayList<Game> games = new ArrayList<Game>();
    
    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*
    public <Game> getGames() {
        return games;
    }

    public void setGames(<Game> games) {
        this.games = games;
    }
**/

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
   
    
    
    //set toString, hashCode, equals
    
   