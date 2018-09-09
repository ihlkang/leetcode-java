package bishi;

import java.util.*;

public class Goods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            data.add(temp);
        }
        Collections.sort(data, new Comparator<List<Integer>>() {
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0)-o2.get(0);
            }
        });
        System.out.println(getWorngCount(data));
    }

    private static int getWorngCount(List<List<Integer>> data) {
        int count = 0;
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = i+1; j < data.size(); j++) {
                if (data.get(i).get(0) != data.get(j).get(0)) {
                    if (data.get(i).get(1) < data.get(j).get(1) && data.get(i).get(2) < data.get(j).get(2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
