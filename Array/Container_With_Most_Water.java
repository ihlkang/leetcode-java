package Array;

/*
 * 11��
 * ľͰ���⣬�����װ����ˮ
 * ����[1,1]�����1
 */
public class Container_With_Most_Water {
	public int maxArea(int[] height) {
		int i=0,j=height.length-1;
		int water=0;
		while(i<j){
			int h=Math.min(height[i], height[j]);
			water=Math.max(water,h*(j-i));
			while(height[i]<=h && i<j){
				i++;
			}
			while(height[j]<=h && i<j){
				j--;
			}
		}
		return water;
	}

	public static void main(String[] args) {
		int[] height=new int[]{1,2,1,3,4,6,2,1};
		Container_With_Most_Water cwmw=new Container_With_Most_Water();
		cwmw.maxArea(height);
	}

}
