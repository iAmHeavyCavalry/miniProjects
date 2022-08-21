import javax.swing.*;

public class test5 {

    public static void main(String[] args){

        long resultado = 1L;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        for(int i = numero; i > 0; i--){
            resultado = resultado * i;
        }
        System.out.println("Factorial of " + numero + " is " + resultado);
    }
}
