import javax.swing.*;

public class test2 {

    public static void main(String[] args){

        int aleatorio = (int) (Math.random() * 100);

        int numero = 0;
        int intentos = 0;

        do{
            intentos++;
            String input = JOptionPane.showInputDialog("Number: ");
            numero = Integer.parseInt(input);
            if(aleatorio < numero){
                System.out.println("Mas bajo");
            } else if (aleatorio > numero) {
                System.out.println("Mas alto");
            }
        }while(numero != aleatorio);
        System.out.println("Correcto! " + intentos + " intentos!");
    }
}
