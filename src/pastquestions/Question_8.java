package pastquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> alp = new ArrayList<>();
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            int tmp=str.charAt(i)-'0';
            if(tmp>=0&&tmp<=9){
                num+=tmp;
            }
            else{
                alp.add(str.charAt(i));
            }
        }
        Collections.sort(alp);
        for (Character character : alp) {
            System.out.print(character);
        }
        System.out.print(num);
        System.out.println();
    }
}
