import java.util.ArrayList;
import java.util.List;

public class Adopter extends User {
    public List<Integer> adoptionHistory; 


    public Adopter(int id, String username, String password) {
        super(id, username, password);
        this.adoptionHistory = new ArrayList<>();
    }
    public Adopter(int id, String username, String password,List<Integer> adoptionHistory) {
        super(id, username, password);
        this.adoptionHistory =adoptionHistory;
    }
    public Adopter( String username, String password,List<Integer> adoptionHistory) {
        super(username, password);
        this.adoptionHistory =adoptionHistory;
    }



}

public void ManageProfile()
    {   System.out.println("====== Manage Profile =====");
        System.out.println("1. Change User Name");
        System.out.println("2. Change Password");
        System.out.println("3. Back");

        int choice = Screen.getIntInput("Choice");
        switch (choice) {
            case 1:
            {
                String username=Screen.getInput("New User Name is : ");
                this.setUsername(username);
                Screen.displayMessage("Your UserName is : "+username);
            }
                break;
            case 2:{
                
                if(this.password.equals(Screen.getInput("Please Enter the Current Password")))
                {
                    String NewPassword=Screen.getInput("Enter the New Password");
                    // confirm password (if you need ) ---> read it again to confirm
                    this.password=NewPassword;
                }
                else{
                    Screen.getInput("Wrong Password");
                
                }
            }
                break;
            case 3 :
            System.out.println("LOG OUT");
                return;
            
            default : Screen.displayMessage("Invalid choice.");
        }
    }
