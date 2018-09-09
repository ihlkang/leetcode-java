package Math;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BianLi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> data = new HashMap<>();
        int step = 0;
        int num = in.nextInt();

        for (int i = 0; i < num - 1; i++) {
            int m = in.nextInt();
            int l = in.nextInt();
            if (m > l) {
                data.put(m, l);
            }
        }
        for (int j = 1; j <= num; j++) {
            if (data.get(j) != null) {
                if (data.get(j) == j + 1) {
                    step++;
                } else {
                    step += 2;
                }
            } else {
                step++;
            }
        }
        System.out.println(step);
    }
}
