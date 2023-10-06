package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeasureTheLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        tokens = br.readLine().split(" ");
        int[] items = new int[n];
        for (int i = 0; i < tokens.length; i++) {
            items[i] = Integer.parseInt(tokens[i]);
        }

        int result = binarySearch(items, m);

        System.out.println(result);
    }

    static int binarySearch(int[] items, int m) {
        int start = 0;
        int end = items[items.length - 1];
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int totalLen = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i] > mid) {
                    totalLen += items[i] - mid;
                }
            }
            if (totalLen < m) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }

        }
        return result;
    }

}
