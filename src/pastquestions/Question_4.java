package pastquestions;

import java.util.Arrays;
import java.util.Scanner;

/*
didn't solve
 */
class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] data=new int[n+1];
        for (int i = 0; i < n; i++) {
            data[i]=sc.nextInt();
        }

        Arrays.sort(data);
        int target=1;
        for (int datum : data) {
            if(datum>target){
                break;
            }
            target+=datum;
        }
        System.out.println(target);
    }
}