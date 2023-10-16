package pastquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> houses = new ArrayList<>();
        for (int i = 0; i < n; i++) houses.add(sc.nextInt());

        Collections.sort(houses);

        if (houses.size() % 2 == 0) {
            if (houses.get(houses.size() / 2 - 1) <= houses.get(houses.size() / 2)) {
                System.out.println(houses.get(houses.size() / 2 - 1));
            } else {
                System.out.println(houses.get(houses.size() / 2));
            }
        } else {
            System.out.println(houses.get(houses.size() / 2));
        }

    }
}
