package String;
import java.util.HashMap;
import java.util.Map;

/*
 * abcxyz123
 * dict=["abc","123"]
 * <b>abc</b>xyz<b>123</b>
 */
public class add_BoldTag {

	public String addBoldTag(String s,String[] dict){
		String result="";

		boolean[] bold=new boolean[s.length()];
		for(String d:dict){
			for(int i=0;i<=s.length()-d.length();i++){
				if(s.substring(i, i+d.length()).equals(d)){
					for(int j=i;j<i+d.length();j++){
						bold[j]=true;
					}
				}
			}
		}
		for(int i=0;i<s.length();){
			if(i<s.length() && bold[i]==true){
				result+="<b>";
				while(i<s.length() && bold[i]==true){
					result+=s.charAt(i++);
				}
				result+="</b>";
			}else{
				result+=s.charAt(i++);
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		add_BoldTag s=new add_BoldTag();
		String[] dict=new String[]{"abc","123"};
		s.addBoldTag("abcxyz123", dict);
	}

}
