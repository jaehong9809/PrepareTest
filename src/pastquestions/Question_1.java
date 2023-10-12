package pastquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        List<Integer> users = new ArrayList<>();
        for (String value : s) {
            users.add(Integer.parseInt(value));
        }
        Collections.sort(users);
        int cnt=0;
        int result=0;
        //3 2 2 2 1

        for (int i = 0; i < n; i++) {
            int w = users.get(i);
            cnt++;
            if (cnt == w) {
                cnt=0;
                result++;
            }
        }
        System.out.println(result);

    }

}
