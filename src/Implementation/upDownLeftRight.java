package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class upDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = st.countTokens();
        char[] directions = new char[a];
        int i=0;
        while (st.hasMoreTokens()) {
            directions[i]=st.nextToken().charAt(0);
            i++;
        }
        // 1 <= x <= n
        int x=1;
        int y=1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] dirs = {'U', 'D', 'L', 'R'};
        for (char direction : directions) {
            int nx=x;
            int ny=y;
            for (int j = 0; j < 4; j++) {
                if (direction == dirs[j]) {
                    nx += dx[j];
                    ny += dy[j];
                }
            }
            if (!(nx >= 1 && nx <= n && ny >= 1 && ny <= n)) {
                continue;
            }
            x=nx;
            y=ny;
        }


/*
        for (int j = 0; j < a; j++) {
            if(directions[j]=='R'){
                if (x >= n) {
                    continue;
                }
                x++;
            }
            if (directions[j] == 'L') {
                if(x<=1){
                    continue;
                }
                x--;
            }
            if (directions[j]== 'U') {
                if(y<=1){
                    continue;
                }
                y--;
            }
            if (directions[j]== 'D') {
                if(y>=n){
                    continue;
                }
                y++;
            }
        }*/
        System.out.println(y+" "+x);
    }
}
