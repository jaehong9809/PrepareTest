package dynamicprogramming;

import java.util.Scanner;

public class FloorConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
            n = result
            1 = 1
            2 = 3
            3 = 5
            4 = == 11= 1=1 =11 ㅁㅁ ㅁ11 1ㅁ1 11ㅁ 1111 =ㅁ ㅁ=  = 11
            a(i) = a(i-1) + a(i-2) × 2
         */
        int[] dp = new int[1001];
        dp[1]=1;
        dp[2]=3;
        for (int i = 3; i <= n; i++) {
            dp[i]=(dp[i-1]+dp[i-2]*2)%796796;
        }
        System.out.println(dp[n]);
    }
}
