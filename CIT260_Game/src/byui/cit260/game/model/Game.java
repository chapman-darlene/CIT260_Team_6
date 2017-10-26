package byui.cit260.game.model;



import GamePackage.Main;
import byui.cit260.game.model.Player;
import java.io.Serializable;
import java.util.Objects;
import java.lang.Object;

/**
 *
 * @author DChapman
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    private int noPeople;
    private Player player;
    
    //Is this how we should setup theGame variable?
    private static Game theGame = null;
    private static Crops theCrops = null;
        

    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static Crops getCrop(){
        return theCrops;
    }
    
    public static void setCrop(Crops _cropRef){
        theCrops = _cropRef;
    }

    
    //is this what we should do for this variable?
    public static Game getGame(){
        return theGame;
    }
    
    public static void setGame(Game _gameRef){
        theGame = _gameRef;
    }

     
    
    //set toString, hashCode, equals
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 71 * hash + this.noPeople;
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }

    
    
    
}