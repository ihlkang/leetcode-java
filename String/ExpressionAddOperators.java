package String;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
	
	public List<String> addOperators(String num, int target) {
		List<String> list=new ArrayList<String>();     
		getresult(list,num,"",target,0,0,0);
		return list;
	}
	public void getresult(List<String> list,String num,String path,int target,int pos,long eval,long mul){
		if(pos==num.length()){
			if(target==eval){
				list.add(path);
			}
		}else{
			for(int i=pos;i<num.length();i++){
				if(num.charAt(pos)=='0' && i==pos+1)
					break;
				long curr=Long.parseLong(num.substring(pos,i+1));
				if(pos==0){
					getresult(list,num,path+num.charAt(i),target,pos+1,curr,curr);
				}else{
					getresult(list,num,path+"+"+num.charAt(i),target,pos+1,eval+curr,curr);
					getresult(list,num,path+"-"+num.charAt(i),target,pos+1,eval-curr,-curr);
					getresult(list,num,path+"*"+num.charAt(i),target,pos+1,eval-mul+mul*curr,mul*curr);
				}
			}
		}
	}
	public static void main(String[] args) {
		ExpressionAddOperators eao=new ExpressionAddOperators();
		eao.addOperators("123",6);
	}

}
