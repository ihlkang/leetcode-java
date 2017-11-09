package Math;
/*
 *  9Ìâ
 */
import java.util.List;
import java.util.ArrayList;

public class Palindrome_Number {
	
	public boolean isPalindrome(int x) {
		List<Integer> list=new ArrayList<Integer>();
		int i,j;
		if(x>=0 && x<=9){
			return true;
		}
		while(x!=0){
			list.add(x%10);
			x=x/10;
		}
		if(list.size()%2==0){
			i=list.size()/2-1;
			j=list.size()/2;
		}else{
			i=j=list.size()/2;
		}
		while(i>=0 && j<=list.size()){
			if(list.get(i)==list.get(j)){
				i--;
				j++;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Palindrome_Number pn=new Palindrome_Number();
		System.out.println(pn.isPalindrome(1431));
	}

}
