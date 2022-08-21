import javax.swing.*;

public class test3 {
    public static void main(String[] args){

        String genero = "";

        do{
            genero = JOptionPane.showInputDialog("Introduce genero M/F");


        }while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F"));

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
        int peso = 0;

        if(genero.equalsIgnoreCase("M")){
            peso = altura-100;
        } else if (genero.equalsIgnoreCase("F")) {
            peso = altura-110;
        }
        System.out.println("Tu peso ideal es " + peso);
    }
}
