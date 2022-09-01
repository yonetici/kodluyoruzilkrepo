import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        String uName, uPass, setPass, resetPass, defaultUname = "patika", defaultUpass = "kodluyoruz";
        Scanner input = new Scanner(System.in);
        System.out.println("Username : ");
        uName = input.nextLine();
        System.out.println("Password : ");
        uPass = input.nextLine();
        if (uPass != defaultUpass) {
            System.out.println("Your password is wrong.\nDo you want to set a new password?\nType yes or no");
            resetPass = input.nextLine();
            if(resetPass.equals("no")) {
                System.out.println("Session ended. Please try again");
            } else if(resetPass.equals("yes")) {
                System.out.println("Type your new password");
                setPass = input.nextLine();
                if(setPass == uPass) {
                    System.out.println("New password should be different from your old password. Please try again");
                } else {
                    System.out.println("Congratulations! \nYour password has been changed successfully.");
                }
                
            } else {
                System.out.println("You made the wrong choice");
            }
        } else {
            System.out.println("You are logged in!");
        }
        
    }
}
