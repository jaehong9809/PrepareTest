package pastquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_28 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        String[] strs = br.readLine().split(" ");
        int[] data=new int[strs.length];

        for(int i=0; i<strs.length; i++){
            data[i]=Integer.parseInt(strs[i]);
        }

        int result=binarySearch(data);
        if(result>=0){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }

    }
    static int binarySearch(int[] data){
        int start=0;
        int end=data.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid==data[mid]){
                return mid;
            }
            System.out.printf("mid = %d, value = %d\n", mid, data[mid]);
            // index=3, data[index]= 1;
            if(mid>data[mid]){
                end=mid+1;
            }
            //index=3, data[index]=5;
            if(mid<data[mid]){
                start=mid-1;
            }

        }

        return -1;
    }
}
