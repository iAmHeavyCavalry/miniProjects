import java.util.Scanner;

public class test9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] rooms = new int[x];

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = (int) Math.round(Math.random()*100);
        }
        for(int number:rooms){
            System.out.println(number + " ");
        }
    }
}
