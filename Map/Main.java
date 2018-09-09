package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        String[] histKeyWords = new String[]{"连衣裙 99","衣裙连 10","苹果 80"};
        String[] searKeyWord = new String[]{"连衣裙"};
        int histCount = histKeyWords.length;
        int searCount = searKeyWord.length;
        StringBuffer buffer = new StringBuffer();
        Map<String,Integer> histMap = new HashMap<>();
        for(int i=0;i<histKeyWords.length;i++){
            String[] keyValue = histKeyWords[i].split(" ");
            histMap.put(keyValue[0],Integer.parseInt(keyValue[1]));
        }
        for(int i=0;i<searCount;i++){
            String[] keys = searKeyWord[i].split(" ");
            if(histMap.containsKey(searKeyWord[i]) ){
            }
            buffer.replace(buffer.lastIndexOf("\n"),buffer.length(),"");
        }
        System.out.println(buffer);
    }
}
