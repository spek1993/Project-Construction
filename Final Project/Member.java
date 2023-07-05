/**
 *@author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;

public class Member {

    static Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private String nName;
    private String nColor;
    private double nprice;
    
    public Member()
    {
        nName = "";
        nColor = "";
        nprice = 0.0;
    }
    
    public Member(String name,String color,double price)
    {
        nName = name;
        nColor = color;
        nprice = price;
    }
    public void setName(String n){
        nName = n;
    }
  
    public String getName()
    {
        return this.nName;
    }
    public String getColor()
    {
        return this.nColor;
    }
    
     public double getPrice()
    {
        return this.nprice;
    }
     
}//end class person
    

