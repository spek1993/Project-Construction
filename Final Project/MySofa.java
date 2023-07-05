/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/** Extends MyFurniture Object */
public  class MySofa extends MyFurniture {
    private String sofaId;
    private String sofaName;
    private double discount;
    private double price;
        

    public MySofa()														
    {
        sofaId = "";
        sofaName = "";
        price = 0.0;
    }
        
    public MySofa(double p)														
    {
        price = p;
    }

    public MySofa(String id, String name, double price)				
    {
        sofaId = id;
        sofaName = name;
        price = price;
    }

    public void setPrice(double newPrice)								
    {
        price = newPrice;
    }

    public void listOfSofa()											
    {
        JDialog.setDefaultLookAndFeelDecorated(true);
        System.out.print("\n");
        Object[] selectionValues = { "GA233 Lousiana", "GA235 Gorgia", "GA236 Ottava" };
        String initialSelection = "GA233 Louisiana";
        Object selection = JOptionPane.showInputDialog(null, "Your Favourite Sofa Set?",
                "Your Favourite Sofa Set", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println("Your choosen Sofa Set is : " + selection);   
}

    public void readInput()												
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter your favourite sofa code : ");
        sofaId = input.nextLine();

        System.out.print("Enter your favourite sofa name : ");
        sofaName = input.nextLine();

        System.out.print("Enter sofa's price : ");
        price = input.nextDouble();

    }
      
    @Override
      public String toString() {
        return "Thank You!. Your Purchased Date is on " + datePurchased ;
    }

    public void mixColor()												
    {
        JDialog.setDefaultLookAndFeelDecorated(true);
        System.out.print("\n");
        System.out.print("Ohh wait!!!You can choose your favourite color too!!!");
        Object [] selectionValues = {"Red and Black", "Pink and Turqoise", "Light Green and Cream", "Orrange and Light Green"};
        String initialSelection = "Red and Black";
        Object selection = JOptionPane.showInputDialog(null, "Mix and Match",
            "Mix and Match", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println("Colour : " + selection);
    }
    
    //Abstract 
    public double getDiscount()										
    {
        return price -(price*0.10);
    }  
}
