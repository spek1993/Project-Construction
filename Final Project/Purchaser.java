/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;

public class Purchaser {
    private final int id;
    private final String name;
    private String furnitureType;

    public Purchaser (int i, String s, String n){
        id = i;
        name = n;
        furnitureType = s;
    } 
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return id;
    }
    
    public String getFurnitureType(){
        return furnitureType;
    }           
}
