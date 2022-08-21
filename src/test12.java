import java.util.Scanner;

public class test12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        byte y = scanner.nextByte();
        int[][] rooms = new int[x][y];

        int z = 200;

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                z++;
                rooms[i][j] = z;
                System.out.print(rooms[i][j] + " ");
            }
        }
    }
}
