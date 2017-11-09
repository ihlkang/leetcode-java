package String;
/*
 * 30 题
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_Concatenation_of_All_Words {

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>(), currMap = new HashMap<String, Integer>();
		int N = s.length();
		int w = words.length;
		int wl = words[0].length();
		int count;
		String sub,temp;
		if (N < w * wl || wl == 0) {
			return list;
		}
		for (String str : words) {
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		for (int i = 0; i < wl; i++) {
			count = 0;
			for (int l = i, r = i; r + wl <= N; r += wl) {
				sub = s.substring(r, r + wl);
				if (map.containsKey(sub)) {
					if (currMap.containsKey(sub)) {
						currMap.put(sub, currMap.get(sub) + 1);
					} else {
						currMap.put(sub, 1);
					}
					if (currMap.get(sub) <= map.get(sub))
						count++;
					//当当前sub在currMap中的个数小于等于map中的个数时才开始下一个sub的判断
					while (currMap.get(sub) > map.get(sub)) {
						temp = s.substring(l, l + wl);
						currMap.put(temp, currMap.get(temp) - 1);
						l = l + wl;
						if (currMap.get(temp) < map.get(temp))
							count--;
					}
					if(count==w){
						list.add(l);
						temp=s.substring(l,l+wl);
						currMap.put(temp,currMap.get(temp)-1);
						l+=wl;
						count--;
					}
				} else {
					l=r+wl;
					currMap.clear();
					count=0;
				}
			}
			currMap.clear();
		}
		return list;
	}
	public static void main(String[] args) {

		Substring_with_Concatenation_of_All_Words solution = new Substring_with_Concatenation_of_All_Words();
		String[] words ={"word","good","best","good"};
		List<Integer> list = new ArrayList<Integer>();
		list = solution.findSubstring("wordgoodgoodgoodbestword", words);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
