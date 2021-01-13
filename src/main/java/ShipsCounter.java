public class ShipsCounter {
    static int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 1, 1, 1,},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1,}

    };
//    static int[][] ships1 = {
//
//            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1,},
//            {0, 1, 1, 1, 0, 0, 1, 1, 1, 1,},
//    };

    public static void main(String[] args) {
        int count = 0;
        count = getCount(ships);
        System.out.println(count);
    }

    public static int getCount(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0 ; j < array[i].length ; j++ ){
                if (array[i][j] == 1) {
                    if ((i == 0 || array[i-1][j] == 0) && (j == 0 || array[i][j-1] == 0)) {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}