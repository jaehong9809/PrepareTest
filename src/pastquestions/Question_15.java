package pastquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Question_15 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmkx = br.readLine().split(" ");
        int n = Integer.parseInt(nmkx[0]);
        int m = Integer.parseInt(nmkx[1]);
        int k = Integer.parseInt(nmkx[2]);
        int x = Integer.parseInt(nmkx[3]);
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new int[n + 1];

        for (int i = 0; i < m; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            graph.get(a).add(b);
        }

        bfs(x);

        boolean sign=false;
        for (int i = 1; i <=n ; i++) {
            if(k==visited[i]){
                System.out.print(i+" ");
                sign=true;
            }
        }

        if(!sign) System.out.println(-1);
    }

    private static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x]=1;
        int cnt=0;
        while (!queue.isEmpty()) {
            cnt++;
            int now=queue.poll();
            for (int i = 0; i < graph.get(now).size(); i++) {
                int next = graph.get(now).get(i);
                if(visited[next]==0){
                    visited[next] = cnt;
                    queue.offer(next);
                }
            }
        }
    }
}
