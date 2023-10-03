package Implementation;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoyalNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        List<String> col = List.of("a", "b", "c", "d", "e", "f", "g", "h");

        int[] dx = {-2, -2, -1, 1, -1, 1, 2, 2};
        int[] dy = {1, -1, 2, 2, -2, -2, 1, -1};
        int nowcol = col.indexOf(inputString.substring(0, 1))+1;
        int nowrow = inputString.charAt(1)-'0';
        int result=0;
        for (int i = 0; i < 8; i++) {
            int newcol = nowcol + dx[i];
            int newrow = nowrow + dy[i];
            if(newcol>0&&newcol<=8&&newrow>0&&newrow<=8) {
                result++;
            }
        }
        System.out.println(result);

    }
}
