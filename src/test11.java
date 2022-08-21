public class test11 {

    public static void main(String[] args){

        int[][] rooms = {{101, 102, 103, 104, 105},
                         {106, 107, 108, 109, 110},
                         {111, 112, 113, 114, 115}};
        for(int[]fila:rooms){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
            }
        }
    }
}
