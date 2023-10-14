package pastquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Question_16 {
    static int[][] matrix;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        matrix = new int[n + 1][m + 1];
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j]=Integer.parseInt(s[j]);
            }
        }

        for (int i = 1; i <= n * m - 2; i++) {
            int firstRow;
            if (i % m == 0) {
                firstRow = i / (m) - 1;
            } else {
                firstRow = i / m;
            }
            int firstCol = i - (m * firstRow)-1;

            for (int j = i + 1; j <= n * m - 1; j++) {
                int secondRow;
                if (j % m == 0) {
                    secondRow = j / (m) - 1;
                } else {
                    secondRow = j / m;
                }
                int secondCol = j - (m * secondRow)-1;

                for (int k = j + 1; k <= n * m; k++) {

                    int[][] cloneMatrix = new int[n][m];
                    for (int l = 0; l < n; l++) {
                        cloneMatrix[l] = matrix[l].clone();
                    }
                    int thirdRow;
                    if (k % m == 0) {
                        thirdRow = k / (m) - 1;
                    } else {
                        thirdRow = k / m;
                    }
                    int thirdCol = k - (m * thirdRow)-1;
                    if(cloneMatrix[firstRow][firstCol]==0&&cloneMatrix[secondRow][secondCol]==0&&cloneMatrix[thirdRow][thirdCol]==0){
                        cloneMatrix[firstRow][firstCol] = 1;
                        cloneMatrix[secondRow][secondCol] = 1;
                        cloneMatrix[thirdRow][thirdCol] = 1;
                        results.add(simulation(cloneMatrix));
                    }
                }
            }
        }
        System.out.println(Collections.max(results));

    }

    private static Integer simulation(int[][] cloneMatrix) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (cloneMatrix[i][j] == 2) {
                    bfs(cloneMatrix, i ,j);
                }
            }
        }
        int result=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(cloneMatrix[i][j]==0)result++;
            }
        }
        return result;
    }

    private static void bfs(int[][] cloneMatrix, int startx, int starty) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(startx, starty));
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx=now.x+dx[i];
                int ny=now.y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && cloneMatrix[nx][ny] == 0) {
                    cloneMatrix[nx][ny]=2;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
    }

    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
