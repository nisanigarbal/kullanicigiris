import java.util.Scanner;
public class kullanicigirisigelismis {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String username="nisabal", password= "tryagainagain",usernameCheck,passwordCheck;
        System.out.println("login screen");
        System.out.print("username:");
        usernameCheck=scanner.next();

        if((!username.equals(usernameCheck))){
            System.out.print("username is wrong, wanna change the password?(type 'yes' or 'no'");
            String choice= scanner.next();
            if(choice.equals("yes")){
                System.out.print("new password:");
                passwordCheck= scanner.next();
                if(password.equals(passwordCheck)){
                    System.out.print("couldnt generated the password. try again");
                }
                else{
                    System.out.print("password generated, have a great day..");
                }
            }
        }
        else{
            System.out.print("password");
            passwordCheck=scanner.next();
            if(password.equals(passwordCheck)){
                System.out.println("logged in succesfully");
            }
            else{
                System.out.println("password is wrong,try again");
            }
        }

    }
}

