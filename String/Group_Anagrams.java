package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 49 题
 * Given an array of strings, group anagrams together.
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * return [["ate", "eat","tea"],["nat","tan"],["bat"]]
 */
public class Group_Anagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs==null || strs.length==0)
			return new ArrayList<List<String>>();
		Map<String,List<String>> map=new HashMap<String, List<String>>();
		for(String str:strs){
			char[] chars=str.toCharArray();
			Arrays.sort(chars);
			String key=String.valueOf(chars);
			if(!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(str);//map.get()获取的是List<String>这个对象，执行add()是在里面添加str
		}
		return new ArrayList<List<String>>(map.values());	
	}

	public static void main(String[] args) {
		String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		Group_Anagrams ga=new Group_Anagrams();
		ga.groupAnagrams(strs);
	}

}
