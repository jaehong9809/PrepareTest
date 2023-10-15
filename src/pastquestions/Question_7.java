package pastquestions;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = 0;
        boolean even;
        if(str.length()%2==0)even=true;
        else even=false;

        /*for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i) - '0';
            if(even){
                if(i<(str.length()/2)){
                    left+=tmp;
                }
                else{
                    right+=tmp;
                }
            }
            else{
                if(i<(str.length()/2)){
                    left+=tmp;
                }
                if(i>(str.length()/2)){
                    right+=tmp;
                }
            }
        }*/
        for (int i = 0; i < str.length()/2; i++) {
            left += str.charAt(i) - '0';
            right += str.charAt(str.length() - i - 1)-'0';
        }
        System.out.println(left+ " "+right);
        if(left==right) System.out.println("LUCKY");
        else System.out.println("READY");
    }
}
