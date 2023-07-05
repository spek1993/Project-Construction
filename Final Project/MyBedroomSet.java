/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */
package furniture;
import java.util.Scanner;

/** Extends abstract MyFurniture Object */
public class MyBedroomSet extends MyFurniture {
    private String bedId, bedName;
	private String type;
	private double price;

	public MyBedroomSet()
	{
		bedId = "";
		bedName = "";
		price = 0.0;
	}
        
        public String getBedName()
	{
		return bedName;
	}
        
        public MyBedroomSet(double p) {
            price = p;
        }

	public MyBedroomSet(String newBedId, String newBedName, double newPrice)
	{
            bedId = newBedId;
            bedName = newBedName;
            price = newPrice;
	}
        
        //to filter type of bedroom based on user choice 
	public String typeOfBedroomType() 
	{
            String newType;

            Scanner input = new Scanner(System.in);

            System.out.print("\nEnter your preferred size of bedroom set : SINGLE | QUEEN | KING : ");
            newType = input.nextLine();

            switch (newType) //filtering type
            {
                    case "SINGLE":
                            newType = "G045 Zella Charcoal Set";
                            System.out.println("G045 Zella Charcoal Set");
                            break;

                    case "QUEEN":
                            newType = "G046 Exquisite Twin Set";
                            System.out.println("G046 Exquisite Twin Set");
                            break;

                    case "KING":
                            newType = "G047 Chatham King Set";
                            System.out.println("G047 Chatham King Set");
                            break;

                    default:
                            System.out.println("Invalid choice!!");
                            System.exit(0);
            }
            return newType;

	}

	public void readInput()									
        {
            Scanner input = new Scanner(System.in);

            System.out.print("\nEnter your favourite bedroom code : ");
            bedId = input.nextLine();

            System.out.print("Enter your favourite bedroom set name : ");
            bedName = input.nextLine();
        }

    @Override
        public String toString() {
            return super.toString() + "\nPurchased on :" + datePurchased;
        }
             
         //@Abstract Method
        public double getDiscount() {                  
            return price -(price*0.05);
        }
}