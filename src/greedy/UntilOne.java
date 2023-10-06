package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UntilOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result=0;

        while (true){
            if(n%k==0){
                result++;
                n=n/k;
                if(n<=1){
                    break;
                }
            }
            else{
                n--;
                result++;
                if(n<=1){
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
