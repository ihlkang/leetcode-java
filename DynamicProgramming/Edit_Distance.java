package DynamicProgramming;
/*
 * 72��
 * Given two words word1 and word2, 
 * find the minimum number of steps required to 
 * convert word1 to word2. (each operation is counted as 1 step.)
 * (a,b)��(b,c,d)
 *        b c d
 *      0 1 2 3
 *   0[ 0 1 2 3]
 * a 1[ 1      ]
 * b 2[ 2      ]
 * ��������1,2,3����aǰ��Ŀո����β���b,c,d��Ҫ�Ĳ���
 * ���е�1��2����aɾ����a��bɾ����Ҫ�Ĳ���
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
					int a=ww[i][j]+1;//ֱ�ӽ�word1��i+1λ�õ��ַ��滻Ϊword2��j+1λ���ַ�����ǰ���ַ������������ϼ�1
					int b=ww[i][j+1]+1;//��i+1λ�õ��ַ�ɾ������word1ǰ���i���ַ���word2��j+1���ַ�ƥ�䣬������������1
					int c=ww[i+1][j]+1;//��word1��i+1���ַ���word2��j���ַ�ƥ��,����һ�������������1
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
