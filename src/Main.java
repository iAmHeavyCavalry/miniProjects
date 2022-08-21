import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String password = "mathias";
        String pass = "";

        while(!password.equals(pass)){

            pass = JOptionPane.showInputDialog("Password: ");

            if(!password.equals(pass)) {
                System.out.println("Invalid password. Access denied");
            }
        }
        System.out.println("Correct password. Access granted");
    }
}