package DynamicProgramming;
/*
 * 72题
 * Given two words word1 and word2, 
 * find the minimum number of steps required to 
 * convert word1 to word2. (each operation is counted as 1 step.)
 * (a,b)和(b,c,d)
 *        b c d
 *      0 1 2 3
 *   0[ 0 1 2 3]
 * a 1[ 1      ]
 * b 2[ 2      ]
 * 横行其中1,2,3代表a前面的空格依次插入b,c,d需要的步数
 * 竖列的1，2代表将a删除，a、b删除需要的步数
 */
public class Edit_Distance {
	
	public int minDistance(String word1, String word2) {
		int l1=word1.length();
		int l2=word2.length();
		int[][] ww=new int[word1.length()+1][word2.length()+1];
		for(int i=0;i<word1.length()+1;i++){
			ww[i][0]=i;
		}
		for(int i=0;i<word2.length()+1;i++){
			ww[0][i]=i;
		}
		for(int i=0;i<word1.length();i++)
			for(int j=0;j<word2.length();j++){
				if(word1.charAt(i)==word2.charAt(j)){
					ww[i+1][j+1]=ww[i][j];
				}else{
					int a=ww[i][j]+1;//直接将word1的i+1位置的字符替换为word2的j+1位置字符，在前面字符操作步骤数上加1
					int b=ww[i][j+1]+1;//把i+1位置的字符删除，让word1前面的i个字符与word2的j+1个字符匹配，操作步骤数加1
					int c=ww[i+1][j]+1;//让word1的i+1个字符与word2的j个字符匹配,最后加一个插入操作，加1
					ww[i+1][j+1]=a<b?(a<c?a:c):(b<c?b:c);
				}
			}
		return ww[l1+1][l2+1];
	}

	public static void main(String[] args) {
		Edit_Distance ed=new Edit_Distance();
		ed.minDistance("ab", "bcd");
	}

}
