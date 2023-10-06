package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FromUpToBottom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(data, Collections.reverseOrder());
        for (Integer num : data) {
            System.out.print(num+" ");
        }
    }
}
