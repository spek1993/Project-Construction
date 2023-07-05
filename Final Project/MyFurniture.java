/**
 *
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;
import java.text.DecimalFormat;

public abstract class MyFurniture {
    private String type;
    final java.util.Date datePurchased;
    private int numOfType;
    private final Purchaser[] furnitureList; //showing association

    /** Construct a default furniture object */
    protected MyFurniture() {
        datePurchased = new java.util.Date();
        furnitureList = new Purchaser[5];

    }

    /** Construct a furniture object with the specified type and choice 
     * @return
     * @param type
     * @param c
     * @param numOfType
     */
    protected MyFurniture(String type, String c) {
        datePurchased = new java.util.Date();
        this.type = type;
        furnitureList = new Purchaser[5];
    }

    /**Return type 
     * @return */
    public String getType() {
        return type;
    }

    /** Set a new type of furniture 
     * @param type */
    public void setType(String type) {
        this.type = type;
    }

    /** Get dateCreated
 * @return  */
    public java.util.Date getDatePurchased() {
        return datePurchased;
    }

    /** Return a string representation of this object
   @Overidde Annotation*/
    public String toString() {
        return "Purchased on " + datePurchased;
    }

    /** Showing association
    @param p1 */
    public void addFurnitureList(Purchaser p1) {
        furnitureList[numOfType]= p1;
        numOfType++;
    }

    public void printAllInfo(){
        for(int i = 0;i<numOfType; i++){
            Purchaser s = (Purchaser)furnitureList[i];
            System.out.println((i+1) + ". " +  s.getFurnitureType() );
        } 
    }
    
    /** Abstract method getDiscount */
    public abstract double getDiscount();

}

