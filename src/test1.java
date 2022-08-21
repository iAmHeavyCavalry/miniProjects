import javax.swing.JOptionPane;
public class test1 {

    public static void main(String[] args){

        double num = Math.random()*100;
        double num1 = Math.round(num);
        int user = 0;
        System.out.println(num1);

        while(user != num1){
            String pass = JOptionPane.showInputDialog("Enter number: ");
            user = Integer.parseInt(pass);
                    if(user != num1) {
                        System.out.println("Wrong number");
                    }
        }
        System.out.println("You win");
    }
}
