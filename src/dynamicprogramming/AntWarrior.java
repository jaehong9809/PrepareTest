package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntWarrior {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] inputs = bufferedReader.readLine().split(" ");
        int[] charges = new int[n];
        int[] dp = new int[101];
        for (int i = 0; i <n ; i++) {
            charges[i]=Integer.parseInt(inputs[i]);
        }
        dp[0]=charges[0];
        dp[1]=Math.max(charges[0], charges[1]);
        dp[2] = Math.max(charges[1], charges[0] + charges[2]);
        for (int i = 3; i < n; i++) {
            dp[i]=Math.max(dp[i-1], dp[i-2]+charges[i]);
        }
        System.out.println(dp[n-1]);
    }
}
