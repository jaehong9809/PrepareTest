package pastquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] data=new int[n];
        for (int i = 0; i < n; i++) {
            data[i]=sc.nextInt();
        }

        Arrays.sort(data);
        Set<Integer> set = new HashSet<>();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(!set.contains(data[i])){
                set.add(data[i]);
                int l=lowerBound(data, data[i]);
                int u=upperBound(data, data[i]);
                int num=u-l;
                cnt+=num*(n-u);
              /*  System.out.println("lb = "+l);
                System.out.println("ub = "+u);
                System.out.println("num = "+num);
                System.out.println("num2 = " +(n-u));
                System.out.println("cnt = "+cnt);
                System.out.println();*/
            }
        }
        System.out.println(cnt);

    }
    public static int lowerBound(int[] data, int x){
        int start=0;
        int end=data.length;
        while (start<end){
            int mid=(start+end)/2;
            if(data[mid]>=x){
                end=mid;

            }
            if(data[mid]<x){
                start=mid+1;
            }
        }
        return end;
    }
    public static int upperBound(int[] data, int x){
        int start=0;
        int end=data.length;
        while (start<end){
            int mid=(start+end)/2;
            if(data[mid]>x){
                end=mid;
            }
            if(data[mid]<=x){
                start=mid+1;
            }
        }

        return end;
    }
}