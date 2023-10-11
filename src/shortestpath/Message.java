package shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Message {
    static int INF=(int)1e9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nmc= br.readLine().split(" ");
        int n = Integer.parseInt(nmc[0]);
        int m = Integer.parseInt(nmc[1]);
        int c = Integer.parseInt(nmc[2]);
        
        int[] d=new int[n+1];
        Arrays.fill(d, INF);
        
        List<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] xyz = br.readLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            graph.get(x).add(new Node(y, z));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(c, 0));
        d[c]=0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int now=node.y;
            int dist=node.weight;
            if (d[now] < dist) {
                continue;
            }
            for (int i = 0; i < graph.get(now).size(); i++) {
                int sum=graph.get(now).get(i).weight+d[now];
                if (sum < d[graph.get(now).get(i).y]) {
                    d[graph.get(now).get(i).y]=sum;
                    pq.offer(new Node(graph.get(now).get(i).y, sum));
                }
            }
        }
        int cnt=0;
        int max=-1;
        for (int i = 1; i <= n ; i++) {
            if(d[i]!=0&&d[i]!=INF)cnt++;
            if(d[i]>max){
                max=d[i];
            }
        }
        for (int i : d) {
            System.out.printf("%d ", i);
        }
        System.out.printf("%d %d", cnt, max);
    }
    static class Node implements Comparable<Node> {
        private int y;
        private int weight;
        public Node(int y, int weight) {
            this.y = y;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            if (this.weight == o.weight) {
                return this.y-o.y;
            }
            return this.weight - o.weight;
        }
    }
}
