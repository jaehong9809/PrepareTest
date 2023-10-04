public class Main {
    public static void main(String[] args) {
        int[][] abc = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                abc[i][j]=3;
            }
        }
        int[][] qwe = aa(abc);
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(qwe[i][j]);
            }
            System.out.println();
        }


    }

    static int[][] aa(int[][] matrix){
        int[][] clone = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < 3; i++) {
            clone[i] = matrix[i].clone();
        }
        System.out.println(matrix.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                clone[i][j]+=11;
            }
        }
        System.out.println();
        return matrix;
    }
}