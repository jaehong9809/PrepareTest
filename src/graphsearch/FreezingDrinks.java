package graphsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class FreezingDrinks {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputFirst = br.readLine().split(" ");
        int n=Integer.parseInt(inputFirst[0]);
        int m=Integer.parseInt(inputFirst[1]);
        int[][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            String inputLine = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j]=inputLine.charAt(j)-'0';
            }
        }
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==0){
                    bfs(matrix, i, j, n, m);
                    cnt++;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(cnt);
    }

    public static void bfs(int[][] matrix, int x, int y, int n, int m) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(x, y));
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Pair now = queue.poll();
            int nowx = now.getX();
            int nowy = now.getY();
            for (int i = 0; i < 4; i++) {
                int nx=nowx+dx[i];
                int ny=nowy+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&matrix[nx][ny]==0){
                    queue.offer(new Pair(nx, ny));
                    matrix[nx][ny]=1;
                }
            }
        }
    }


}
class Pair{
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
