/**
 * @author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;


public class TestMyFurniture {
public static void main(String[] args) {
    
    System.out.print("\n////////////////////////////////////////////////////////////////");
    System.out.print("\n//Mardiana binti Abu Hassan\tSX140047CSJS04//////////////////");
    System.out.print("\n//Nur Allyyaa binti Abdul Halim\tSX140055CSJS04//////////////////");
    System.out.print("\n//Nur Syuhadah binti Zulkifli\tSX1401047SCSV04//////////////////");
    System.out.print("\n//Nurul Hidayah binti Anuar\tSX140056CSJS04//////////////////");
    System.out.print("\n//Application Name : Furniture//////////////////////////////////");
    System.out.print("\n////////////////////////////////////////////////////////////////");
    System.out.print("\n\n\n");

    //**********************************************************************************
    //To Display Furniture Menu
    //**********************************************************************************
    ArrayList<Member> stud = new ArrayList<>();

    boolean control = true;

    while(control){
        int displayMenu = displayMenu();
        int userSelection = userSelection(displayMenu);
        System.out.println("User selects : " + userSelection);

        if(userSelection==1){
            
            System.out.println("*******************************************");
            System.out.println("\t\tEnter New Data ");
            System.out.println("*******************************************");
            Scanner option = new Scanner(System.in);
            System.out.print("How many set of furniture you want to add:  ");
            int op = option.nextInt();

            for(int i = 0;i<op;i++){
                Member mem1 = input();
                stud.add(mem1);   
            }
            
        }
        else if (userSelection==2){
            
            Scanner remove = new Scanner(System.in);
            System.out.println("Insert index to remove");
            int rem = remove.nextInt();
            if(rem>stud.size())
            {
                System.out.println("Index out of bound");
                control = false;
            }
            stud.remove(rem);
        }
        
        else if (userSelection==0){
            control = false;
        }
        
        else if (userSelection==3){
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter index number: ");
            int index = inp.nextInt();
            Member std = option3();
            stud.add(index, std);
        }

        else if (userSelection==4){
            System.out.println("\nThanks for adding to the directory\n");

            displayTable();
           
            for (Member stud1 : stud) {
            String a=((Member) stud1).getName();
            String b =((Member) stud1).getColor();
            double c =((Member) stud1).getPrice();
            String format = "%1$-15s%2$-25s%3$-10s\n";
            DecimalFormat deci = new DecimalFormat("0.00");
            System.out.format(format, a, b,  deci.format(c));
            
            }
                   
        } 
    
        System.out.println("====================================================================");
        System.out.println("\n");
    
    }
    //End Of Furniture Array List*******************************************************
    
    
    //**********************************************************************************
    //To Display Membership Menu
    //**********************************************************************************
    ArrayList<Membership> ship = new ArrayList<>();

    boolean control1 = true;

    while(control1){
        int displayMenu1 = displayMenu1();
        int userSelection1 = userSelection1(displayMenu1);
        System.out.println("User selects : " + userSelection1);

        if(userSelection1==1){
            
            System.out.println("*******************************************");
            System.out.println("\t\tEnter New Membership Details ");
            System.out.println("*******************************************");
            Scanner opt = new Scanner(System.in);
            System.out.print("How many members you want to register today:  ");
            int a = opt.nextInt();

            for(int i = 0;i<a;i++){
                
                Membership ship1 = input1();
                ship.add(ship1);
                
            }
            
        }
        else if (userSelection1==2){
            
            Scanner remove = new Scanner(System.in);
            System.out.println("Insert index to remove");
            int rem = remove.nextInt();
            if(rem>ship.size())
            {
                System.out.println("Index out of bound");
                control1 = false;
            }
            ship.remove(rem);
        }
        
        else if (userSelection1==0){
            control1 = false;
        }
        
        else if (userSelection1==3){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter index number: ");
            int ind = in.nextInt();
            Membership st = option5();
            ship.add(ind, st);
        }

        else if (userSelection1==4){
            System.out.println("\nThanks for adding to the directory\n");

            displayTable1();
           
            for (Membership sh1 : ship) {
                
                String am=((Membership) sh1).getName();
                String bm =((Membership) sh1).getBirthday();
                double cm =((Membership) sh1).getFees();
                String format = "%1$-15s%2$-25s%3$-10s\n";
                DecimalFormat deci = new DecimalFormat("0.00");
                System.out.format(format, am, bm,  deci.format(cm));
            
            }         
        } 
    
    System.out.println("====================================================================");
    System.out.println("\n");
   
    }
    //End Of Membership Array List***************************************************** 
    
    
    //*********************************************************************************
    //To Manage Purchaser Details of Purchased Item
    //*********************************************************************************
    
    MySofa ms1 = new MySofa();
    MyBedroomSet b1 = new MyBedroomSet();
    
    /*Abstract*/
    MyFurniture object2 = new MyBedroomSet(5000);
    MyFurniture object1 = new MySofa(10000);
   
     /** Association*/
    System.out.println();
    System.out.println("TO MANAGE PURCHASER DETAILS OF PURCHASED ITEM");
    System.out.println("Here Is Your Purchaser Details | " + object1.toString());
    System.out.println();
    
    Purchaser p1 = new Purchaser(001, "Mardiana", "Kids Set");
    Purchaser p2 = new Purchaser(002, "Syuhada", "Bedroom Set");
    Purchaser p3 = new Purchaser(003, "Allyyaa", "Sofa Set");

    TypeOfFurniture s1 = new TypeOfFurniture(001,"Emelda", "Sofa Set");
    s1.addFurniture(p3);
    s1.addFurniture(p2);
    s1.printAllInfo();
    
    System.out.println("\n1st Customer | Sofa Set Descriptions");
    ms1.listOfSofa();
    ms1.mixColor();
    
    /** Abstract Class | To Display Sofa Price After Discount */
    displayMyFurnitureObject(object1);
    
    System.out.println("\n" +ms1.toString());
    
    System.out.println();
    
    System.out.println("\nBedroom Descriptions");
    b1.typeOfBedroomType();
    
     /** Display Sofa Discount */
    displayMyFurnitureObject(object2);
    
    System.out.println();
    
    /**To Check If Both Price Are Same Using Abstract Class */
    System.out.println("\nThe two type of furniture have the same price? " + equalDiscount(object1,object2));
    System.out.println();
    
    System.out.println("*******************************************");
    System.out.printf("Total Amount Paid is : RM %.2f", totalPaid(object1,object2));
    System.out.println("\n*******************************************");
    
    System.out.println("\n2nd Customer | Bedroom Set Descriptions");
    TypeOfFurniture s2 = new TypeOfFurniture(002,"Emir Zafran","Bedroom Set");
    s2.addFurniture(p1);
    s2.printAllInfo();
    
    s2.listOfFurniture();
    
    //TODO Interface Implementation | To Find Maximum Price between 2 types of kids furniture
    ComparableKidsSet myKids1 = new ComparableKidsSet();
    ComparableKidsSet myKids2 = new ComparableKidsSet();
    myKids1.showPrice();
    System.out.println();
    myKids2.showPrice();
    
    ComparableKidsSet kids1 = new ComparableKidsSet(myKids1) ;
    ComparableKidsSet kids2 = new ComparableKidsSet(myKids2) ;
    
    System.out.println();
    System.out.println(Max.max(kids1, kids2));
       
}

/** A method for comparing the discount of the two MyFurniture Object | Abstract Class 
 * 
 * @param object1
 * @param object2
 * @return 
 */
public static boolean equalDiscount(MyFurniture object1, MyFurniture object2) {
    return object1.getDiscount() == object2.getDiscount();    
}

public static double totalPaid(MyFurniture object1, MyFurniture object2) {
    return object1.getDiscount() + object2.getDiscount();    
}
/** A method for displaying  the discount of the two MyFurniture Object */
public static void displayMyFurnitureObject(MyFurniture object) {
    System.out.printf("Total Price After Discount Is RM %.2f ", object.getDiscount() );
    
}

/** Polymorphism through overriding methods : Display Properties of Furniture */
public static void displayObject(MyFurniture object) {
    System.out.println("test " + object.getDatePurchased() + "Type of furniture " + object.getType());
}
   
//**********************************************************************************
//To Display Menu Of The Application
//**********************************************************************************

 public static int displayMenu(){
        Scanner selection = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("GA Sofa Furniture Details");
        System.out.println("==========================");
        System.out.println("1 - Add New Furniture");
        System.out.println("2 - Remove Furniture");
        System.out.println("3 - Add Furniture to Specific Index");
        System.out.println("4 - Display Furniture Information");
        //System.out.println("5 - Search Data");
        System.out.println("0 - Exit");
        System.out.println("==========================");
        System.out.print("Your Selection : ");
        int select = selection.nextInt();
        System.out.println();
       
        return select;
    }

 public static int userSelection(int displayMenu){
        int a;
        int b = 0;
        a=displayMenu;
        if (a==1){
            System.out.println("1 selected");
            b=1;
        }
        else if (a==2){
            System.out.println("2 selected");
            b=2;
        }
        else if (a==3){
            System.out.println("3 selected");
            b=3;
        }
        else if (a==4){
            System.out.println("4 selected");
            b=4;
        }
        else if (a==5){
            System.out.println("5 selected");
            b=5;
        }
        else if (a==0){
            System.out.println("Exit");
            b=0;
        }
        else
            System.out.println("Error");

        return b;

    }
 //End Furniture Menu
 
 //To Display Membership Menu
 public static int displayMenu1(){
        Scanner selection = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("GA Sofa Membership Details");
        System.out.println("==========================");
        System.out.println("1 - Add New Member");
        System.out.println("2 - Remove Member");
        System.out.println("3 - Add Member to Specific Index");
        System.out.println("4 - Display Member's Information");
        System.out.println("0 - Exit");
        System.out.println("==========================");
        System.out.print("Your Selection : ");
        int select = selection.nextInt();
        System.out.println();
       
        return select;
    }

 public static int userSelection1(int displayMenu1){
        int a;
        int b = 0;
        a=displayMenu1;
        if (a==1){
            System.out.println("1 selected");
            b=1;
        }
        else if (a==2){
            System.out.println("2 selected");
            b=2;
        }
        else if (a==3){
            System.out.println("3 selected");
            b=3;
        }
        else if (a==4){
            System.out.println("4 selected");
            b=4;
        }
        else if (a==5){
            System.out.println("5 selected");
            b=5;
        }
        else if (a==0){
            System.out.println("Exit");
            b=0;
        }
        else
            System.out.println("Error");

        return b;

    }
    //End Of Membership Menu

//Display Table For Furniture Type Menu
public static void displayTable(){
    System.out.println("====================================================================");
    String format = "%1$-15s%2$-25s%3$-10s\n";
    System.out.format(format, "Furniture's Name", "Furniture's Color", "Furniture Price");
    System.out.println("====================================================================");
}

//Display Table For Member's Menu
public static void displayTable1(){
    System.out.println("====================================================================");
    String format = "%1$-15s%2$-25s%3$-10s\n";
    System.out.format(format, "Member's Name", "Member's Birthday", "Member's Fee");
    System.out.println("====================================================================");
}

//To Add New Furniture  
private static Member input() {
    Scanner input = new Scanner(System.in);
    System.out.println("*******************************************");
    System.out.println("\t\tEnter your details ");
    System.out.println("*******************************************");
    System.out.print("Enter furniture name :");
    String name = input.nextLine();
    System.out.print("Enter color :");
    String color = input.nextLine();
    System.out.print("Enter price :");
    double price = input.nextDouble();
    Member mem = new Member(name, color, price);
    System.out.println();
    return mem;

}

//To Add New Furniture To Specific Index
private static Member option3() {
    Scanner index = new Scanner(System.in);
    System.out.print("Enter furniture name :");
    String name = index.nextLine();
    System.out.print("Enter color :");
    String color = index.nextLine();
    System.out.print("Enter price :");
    double price = index.nextDouble();
    Member mem2 = new Member(name, color, price);
    System.out.println();
    return mem2;
}

//To Add New Membership
private static Membership input1() {
    Scanner input = new Scanner(System.in);
    System.out.println("*******************************************");
    System.out.println("\t\tEnter your details ");
    System.out.println("*******************************************");
    System.out.print("Enter Member name :");
    String name = input.nextLine();
    System.out.print("Enter Member Birthday :");
    String birth = input.nextLine();
    System.out.print("Enter Member Fees Registration :");
    double fees = input.nextDouble();
    Membership sh = new Membership(name, birth, fees);
    //stud.add(new Member(name,color,price));
    System.out.println();
    return sh;    
}

//To Add New Membership To Specific Index
private static Membership option5() {
    Scanner index = new Scanner(System.in);
    System.out.print("Enter Member's name :");
    String name = index.nextLine();
    System.out.print("Enter Member's Birthday :");
    String birth = index.nextLine();
    System.out.print("Enter Member's fee Registration :");
    double fees = index.nextDouble();
    Membership shp = new Membership(name, birth, fees);
    System.out.println();
    return shp;
    }

}
