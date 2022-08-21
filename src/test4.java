import javax.swing.*;

public class test4 {

    public static void main(String[] args){

        int arroba = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("Email: ");

        for(int i = 0; i < mail.length(); i++) {

            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto){
            System.out.println("Email correct");
        } else
            System.out.println("Email incorrect");
    }
}
