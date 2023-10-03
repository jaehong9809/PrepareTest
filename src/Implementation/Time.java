package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res=0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <60 ; j++) {
                for (int k = 0; k <60 ; k++) {
                    String stringBuilder = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    if (stringBuilder.contains("3")) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
