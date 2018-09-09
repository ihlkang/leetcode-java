package Math;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        String s ="";
        while((s=sc.next())!=null){
            Integer key = sc.nextInt();
            if(s.equals("g")){
                if(linkedHashMap.containsValue(key)){
                    System.out.println(linkedHashMap.get(key));
                }else{
                    System.out.println("-1");
                }
            }
            if(s.equals("p")) {
                Integer value = sc.nextInt();
                if(linkedHashMap.size()>=num){
                    Integer tailKey = getTailMap(linkedHashMap).getKey();
                    linkedHashMap.remove(tailKey);
                }
                linkedHashMap.put(key, value);
            }
        }
    }

    private static Map.Entry<Integer,Integer> getTailMap(LinkedHashMap<Integer, Integer> linkedHashMap) {
        Iterator<Map.Entry<Integer, Integer>> iterator = linkedHashMap.entrySet().iterator();
        Map.Entry<Integer, Integer> tail = null;
        while (iterator.hasNext()) {
            tail = iterator.next();
        }
        return tail;
    }
}