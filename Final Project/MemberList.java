package furniture;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ViVo
 */
public class MemberList {
    ArrayList<Member>members = new ArrayList<>(20);

   public ArrayList<Member>AddMember()
    {
        Scanner input = new Scanner( System.in );
        
        System.out.println("\n--------------");

        System.out.print ("Please enter new membership name : ");
        String name = input.nextLine();
        System.out.print("Please enter his/her birthday :");
        String birthday = input.nextLine();
        System.out.println("Please enter yearly fees paid : ");
        double fees = input.nextDouble();
        
        members.add(new Member(name,birthday,fees));
        
        return members;
      

    }//end AddMembers
    
 public ArrayList<Member>removeMember()
{
  Scanner input = new Scanner( System.in );

  System.out.println("\n--------------");
  System.out.println("Please enter Name of person you wish you remove");
  String name = input.nextLine(); 

  Member memberToRemove = null;
  for (Member member : members) {
    if (name.equals(member.getName())) {
      members.remove(name);
    }
  } 
  if (memberToRemove != null ) {
    members.remove(name);
  }
  return members;

}//End RemoveFriend
    public static void DisplayArray()
{
   ArrayList<Member> members = new ArrayList<Member>(20);
   System.out.print(members);

}//end DisplayArray

 }//end class FriendsList
    

