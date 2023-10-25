package pastquestions;

import java.util.Scanner;

class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] split = s.split("1");
        String[] split1 = s.split("0");

        int oneCnt=0;
        int twoCnt=0;
        for (String s1 : split) {
            if(s1.length()>0)oneCnt++;
        }
        for (String s1 : split1) {
            if(s1.length()>0)twoCnt++;
        }
        System.out.println(Math.min(oneCnt, twoCnt));
    }
}