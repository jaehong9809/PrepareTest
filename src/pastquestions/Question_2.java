package pastquestions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 4 3 2 0 2 3 4
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i)-'0';
            if (result * a > result + a) {
                result*=a;
            }
            else result+=a;
        }
        System.out.println(result);
    }
}
