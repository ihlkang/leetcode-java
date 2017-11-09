package DynamicProgramming;
/*
 * 63Ã‚
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class Position{
	int x;
	int y;
	public Position(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class Unique_PathsII {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row=obstacleGrid.length;
		int col=obstacleGrid[0].length;
		int count=0;
		Position p=new Position(0,0);
		Queue<Position> queue=new LinkedList<>();
		queue.add(p);
		while(!queue.isEmpty()){
			Position curr=queue.poll();
			if(curr.x+1<row && obstacleGrid[curr.x+1][curr.y]!=1){
				queue.add(new Position(curr.x+1,curr.y));
			}
			if(curr.y+1<col && obstacleGrid[curr.x][curr.y+1]!=1){
				queue.add(new Position(curr.x,curr.y+1));
			}
			if((curr.x==row-1 && curr.y==col-1)){
				count++;
			}
			
		}
		return count;
	}
	public int uniquePathsWithObstaclesII(int[][] obstacleGrid) {
		int col=obstacleGrid[0].length;
		int[] dp=new int[col];
		dp[0]=1;
		for(int[] row:obstacleGrid){
			for(int i=0;i<col;i++){
				if(row[i]==1){
					dp[i]=0;
				}
				else if(i>0){
					dp[i]+=dp[i-1];
				}
			}
		}
		return dp[col-1];
		
	}
	

	public static void main(String[] args) {
		int[][] obstacle=new int[][]{{0,0,0},{0,1,0},{0,0,0}};
		Unique_PathsII up=new Unique_PathsII();
		up.uniquePathsWithObstacles(obstacle);
	}

}
