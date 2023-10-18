package pastquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_27 {
    static int[] data;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        data = new int[n];
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();
        Arrays.sort(data);
        int upperBound = upperBound(x);
        int lowerBound = lowerBound(x);
        System.out.printf("%d \n", (lowerBound-upperBound)*(-1));
    }

    private static int lowerBound(int x) {
        int start = 0;
        int end = data.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (data[mid] < x) {
                start = mid + 1;
            }
            if (data[mid] >= x) {
                end = mid;
            }
        }
        return start;
    }

    private static int upperBound(int x) {
        int start = 0;
        int end = data.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (data[mid] <= x) {
                start = mid + 1;
            }
            if (data[mid] > x) {
                end = mid;
            }
        }
        return end;
    }

}
