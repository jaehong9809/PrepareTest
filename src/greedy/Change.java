package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10};
        int cnt=0;

        for (int i = 0; i < 4; i++) {
            if (n >= coins[i]) {
                cnt+=n/coins[i];
                n%=coins[i];
            }
        }
        System.out.println(cnt);

    }
}
