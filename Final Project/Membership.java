/**
 *@author myTeam --> MARDIANA | NUR ALLYYAA | NUR SYUHADA | NURUL HIDAYAH
 */

package furniture;

public class Membership {
   
    private String nName;
    private String nBirthday;
    private double nFee;
    
    public Membership()
    {
        nName = "";
        nBirthday = "";
        nFee = 0.0;
    }
    
    public Membership(String name,String birth,double fees)
    {
        nName = name;
        nBirthday = birth;
        nFee = fees;
    }
    public void setName(String n){
        nName = n;
    }
  
    public String getName()
    {
        return this.nName;
    }
    public String getBirthday()
    {
        return this.nBirthday;
    }
    
     public double getFees()
    {
        return this.nFee;
    }    
}
    

