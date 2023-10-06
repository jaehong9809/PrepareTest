package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ElementalReplacement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n=Integer.parseInt(nums[0]);
        int k=Integer.parseInt(nums[1]);
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input1[i]);
            b[i] = Integer.parseInt(input2[i]);
        }


        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            a[i]=b[i];
        }
        int reslt = Arrays.stream(a).sum();

        System.out.println(reslt);
    }
}
