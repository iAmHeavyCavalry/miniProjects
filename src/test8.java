import java.util.Scanner;

public class test8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        int[] rooms = new int[x];

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = (i + 100);
            System.out.println(rooms[i]);
        }
    }
}
