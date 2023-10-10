package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// fail to solve
public class EfficientMonetaryComposition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i]=Integer.parseInt(br.readLine());
        }
        int[] dp=new int[m+1];
        Arrays.fill(dp, 10001);
        dp[0]=0;
        for (int coin : coins) {
            for (int i = coin; i <= m; i++) {
                if(dp[i-coin]!=10001){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if(dp[m]==10001){
            System.out.println(-1);
        }
        else {
            System.out.println(dp[m]);
        }

    }
}
