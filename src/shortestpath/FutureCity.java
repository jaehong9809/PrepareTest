package shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FutureCity {
    static int INF=(int)1e9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix=new int[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(matrix[i], INF);
        }
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==j)matrix[i][j]=0;
            }
        }
        for (int i = 0; i < m; i++) {
            String[] paths = br.readLine().split(" ");
            int x = Integer.parseInt(paths[0]);
            int y = Integer.parseInt(paths[1]);
            matrix[x][y]=1;
            matrix[y][x]=1;
        }

        for (int k = 1; k <=n ; k++) {
            for (int x = 1; x <=n ; x++) {
                for (int y = 1; y <= n; y++) {
                    matrix[x][y] = Math.min(matrix[x][y], matrix[x][k] + matrix[k][y]);
                }
            }
        }
        String[] inputs = br.readLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        if(matrix[1][k]+matrix[k][x]>=INF) System.out.println(-1);
        else System.out.println(matrix[1][k]+matrix[k][x]);
    }

}
