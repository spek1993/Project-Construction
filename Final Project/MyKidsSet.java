/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public abstract class MyKidsSet {
    private String kidsId, furName;
    private double price;
        
    public MyKidsSet()
    {
        kidsId = "";
        furName = "";
        price = 0.0;
    }
        
    public MyKidsSet(double p) {
        price = p;
    }

    public MyKidsSet(String newId, String newFurName, double newPrice)
    {
        kidsId = newId;
        furName = newFurName;
        price = 0.0;
    }

    public double getPrice() {
        return this.price;
    }

    public String showPrice()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter the kid's set Id : ");
        kidsId = input.nextLine();

        System.out.print("Pease enter the kid's furniture name :");
        furName = input.nextLine();

        switch(kidsId)
        {
            case("IK001"):
                    price = 45.00;
                    System.out.print("Price is RM :" + price);
                    break;

            case("IK002"):
                    price = 100.00;
                    System.out.print("Price is RM :" + price);
                    break;

            case("IK003"):
                    price = 250.00;
                    System.out.print("Price is RM :" + price);
                    break;

            case("IK004"):
                    price = 150.00;
                    System.out.print("Price is RM :" + price);
                    break;

            case("IK005"):
                    price = 450.00;
                    System.out.print("Price is RM :" + price);
                    break;

            default:
                    System.out.println("Invalid choice!!");
                    System.exit(0);
        }
        return kidsId;
    }

    public void mysteryGift()
    {
        JDialog.setDefaultLookAndFeelDecorated(true);	//using JOptionPane
        System.out.print("\n");
        System.out.print("Congrat's. You're entitled to get a mystery gift from us!!!");

        Object [] selectionValues = {"Little Tayo", "Barbie", "Thomas & Friends", "Roborcar Poli"};
        String initialSelection = "Key Chain";
        Object selection = JOptionPane.showInputDialog(null, "Mystery Gift",
            "Choose Your Gift", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println("\nYou have choose : " + selection);
    }
        
    /**Has Implementations Using Interface*/
    public abstract int compareTo(ComparableKidsSet o); 
       
    
}
