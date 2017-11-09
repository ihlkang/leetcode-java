package HashTable;

public class Island_Perimeter {

	public int islandPerimeter(int[][] grid) {
		int cnt=0,way=0;
		int row=grid.length;
		int col=grid[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(grid[i][j]==1){
					cnt++;
					if(j<col-1 && grid[i][j+1]==1){
						way++;
					}
					if(i<row-1 && grid[i+1][j]==1){
						way++;
					}
				}
				
			}
		}
		return cnt*4-way*2;
	}

	public static void main(String[] args) {
		int[][] grid=new int[][]{{0,1,0,0},
		                          {1,1,1,0},
		                          {0,1,0,0},
		                          {1,1,0,0}};
		Island_Perimeter ip=new Island_Perimeter();
		ip.islandPerimeter(grid);
	}

}
