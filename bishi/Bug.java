package bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bug {
    private static final String PATTERN = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
            + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (ip.length() < 4 || ip.length() > 12) {
            System.out.println(0);
        } else {
            getIpPossibleCount(ip, temp, result);
        }
        System.out.println(result.size());
    }

    private static void getIpPossibleCount(String ip, List<Integer> temp, List<List<Integer>> result) {
        for (int i = 1; i <= 3; i++) {
            temp.add(Integer.parseInt(ip.substring(0, i)));
            for (int j = i + 1; j <= i + 4 && j <= ip.length() - 2; j++) {
                temp.add(Integer.parseInt(ip.substring(i, j)));
                for (int k = j + 1; k < j + 4 && k <= ip.length() - 1; k++) {
                    temp.add(Integer.parseInt(ip.substring(j, k)));
                    temp.add(Integer.parseInt(ip.substring(k)));
                    getCount(ip, temp, result);
                    temp.remove(temp.size() - 1);
                    temp.remove(temp.size() - 2);
                }
                temp.remove(temp.size() - 1);
            }
            temp.remove(temp.size() - 1);
        }
    }

    private static void getCount(String ip, List<Integer> temp, List<List<Integer>> result) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < temp.size(); i++) {
            if (i < temp.size() - 1) {
                stringBuffer.append(temp.get(i) + ".");
            } else {
                stringBuffer.append(temp.get(i));
            }
        }
        if (Pattern.matches(PATTERN, stringBuffer.toString())) {
            result.add(temp);
            return;
        }
    }
}
