package pastquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_37 {
    static final int INF=(int) 1e9;
    static int[][] matrix;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int m=sc.nextInt();
        matrix=new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(matrix[i], INF);
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i==j)matrix[i][j]=0;
            }
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            matrix[a][b]=Math.min(matrix[a][b], w);
        }
        for(int k=1; k<=n;k++){
            for(int a=1; a<=n; a++){
                for(int b=1; b<=n; b++){
                    matrix[a][b]=Math.min(matrix[a][b], matrix[a][k]+matrix[k][b]);
                }
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(matrix[i][j]==INF){
                    System.out.printf("%d ", 0);
                }
                else{
                    System.out.printf("%d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
