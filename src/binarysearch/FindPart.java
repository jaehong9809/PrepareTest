package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindPart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(data);

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            if (binarySearch(data, 0, data.length, Integer.parseInt(st.nextToken()))) {
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }





    }
    public static boolean binarySearch(int[] data, int start, int end, int target){
        while (start<=end){
            int mid=(start+end)/2;
            if(data[mid]==target){
                return true;
            }
            if(data[mid]<target){
                start=mid+1;
            }
            if(data[mid]>target){
                end=mid-1;
            }
        }
        return false;
    }
}
