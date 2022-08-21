public class test10 {

    public static void main(String[] args){

        int[][] rooms = new int[4][5];
        rooms[0][0] = 200;
        rooms[0][1] = 201;
        rooms[0][2] = 202;
        rooms[0][3] = 203;
        rooms[0][4] = 204;

        rooms[1][0] = 205;
        rooms[1][1] = 206;
        rooms[1][2] = 207;
        rooms[1][3] = 208;
        rooms[1][4] = 209;

        rooms[2][0] = 210;
        rooms[2][1] = 211;
        rooms[2][2] = 212;
        rooms[2][3] = 213;
        rooms[2][4] = 214;

        rooms[3][0] = 215;
        rooms[3][1] = 216;
        rooms[3][2] = 217;
        rooms[3][3] = 218;
        rooms[3][4] = 219;

        for(int i = 0; i < 4; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.print(rooms[i][j] + " ");
            }
        }
    }
}
