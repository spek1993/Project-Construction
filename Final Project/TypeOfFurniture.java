/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */
package furniture;

public class TypeOfFurniture {
    private final String name;
    private final int memberId;
    private final Purchaser[] furnitureList;
    private int numOfFurniture;
    
    public TypeOfFurniture(int m,String n, String j){
        name = n;
        memberId = m;
        furnitureList = new Purchaser[10];
    }
    public String getName(){
        return name;
    }
    public int getMemberId(){
        return memberId;
    }
    public void addFurniture(Purchaser p1){
        furnitureList[numOfFurniture]=p1;
        numOfFurniture++;
    }
    public int getNumOfFurniture(){
        return numOfFurniture;
    }
    public void printAllInfo(){
        System.out.println("\nThis furniture set was taken by : " + name);
        System.out.println(name + " was taken " + numOfFurniture + " set (s).");
        System.out.println("List of furniture(s) taken : ");
        
        for(int i = 0;i<numOfFurniture; i++){
            Purchaser s = (Purchaser)furnitureList[i];
            System.out.println((i+1) + ". " + s.getName());
        }        
    }  
    
    public void listOfFurniture()
    {
        String [] list = {"1. IK001 Sundvik Rocking Chair","2. IK002 Kritter Children Chair","3. IK003 Utter Children Table",
                "4. IK004 Stuva Children Table","5. IK005 Poang Children Arm Chair"};
        
        System.out.println("NOTES : Choose 2 type of Kids Set ------>");
        System.out.print("\nHi! Here is the list of furniture that you can choose for your kiddos!! =)");
        System.out.print("\n\n");

        for(int i=0; i<5; i++)
                System.out.println(list[i]);
        
    }
}

    
