package graphsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class EscapeMaze {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = tmp.charAt(j) - '0';
            }
        }
        int result = bfs(matrix, n, m);
        System.out.println(result);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int bfs(int[][] matrix, int n, int m) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        matrix[0][0]=0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Node nowNode = queue.poll();
            int row = nowNode.getRow();
            int col = nowNode.getCol();
            for (int i = 0; i < 4; i++) {
                int nRow=row+dy[i];
                int nCol=col+dx[i];
                if(nRow>=0&&nRow<n&&nCol>=0&&nCol<m&&matrix[nRow][nCol]==1){
                    queue.offer(new Node(nRow, nCol));
                    matrix[nRow][nCol]=matrix[row][col]+1;
                }
            }
        }
        return matrix[n-1][m-1]+1;
    }
    static class Node{
        private int row;
        private int col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }
}
