package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class LawOfLargeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] nums = new Integer[n];
        st = new StringTokenizer(bufferedReader.readLine());
        int i=0;
        while (st.hasMoreTokens()) {
            nums[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(nums, Collections.reverseOrder());
        int result=0;
        /*int cnt=0;
        for (int j = 0; j < m; j++) {
            if(cnt==k){
                result+=nums[1];
                cnt=0;
                continue;
            }
            result+=nums[0];
            cnt++;
        }*/

        int cnt=m/(k+1);

        result=nums[0]*(cnt*k+m%(k+1))+nums[1]*cnt;



        System.out.println(result);
    }
}
