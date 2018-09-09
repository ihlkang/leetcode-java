import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine()),count = 0;
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(scanner.nextInt());
            temp.add(scanner.nextInt());
            temp.add(scanner.nextInt());
            data.add(temp);
        }
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                if (data.get(i).get(0)<data.get(j).get(0)&&data.get(i).get(1)<data.get(j).get(1)&&data.get(i).get(2)<data.get(j).get(2)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}