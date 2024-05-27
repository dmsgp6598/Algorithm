import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int answer = -1;
	static boolean[][] visited;
	static int[] width = {-1, 1, 0 , 0};
	static int[] length = {0, 0, -1, 1};
	
	public static int solution(int[][] maps) {
		visited = new boolean[maps.length][maps[0].length];
		
		bfs(0, 0, maps);
		
		return answer;
	}
	
	public static void bfs(int row, int col, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0, 1));
		
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			if(node.row == maps.length-1 && node.col == maps[0].length-1) {
				answer = node.cnt;
				return;
			}
			
			for(int i=0; i<4; i++) {
				int nRow = node.row + width[i];
				int nCol = node.col + length[i];
				
				if(chkNode(nRow, nCol, maps)) {
					visited[nRow][nCol] = true;
					q.add(new Node(nRow, nCol, node.cnt+1));
				}
				
			}
			
		}
		
	}
	
	static class Node {
		int row;
		int col;
		int cnt;
		
		public Node(int row, int col, int cnt) {
			this.row = row;
			this.col = col;
			this.cnt = cnt;
		}
	}

	public static boolean chkNode(int row, int col, int[][] maps) {
		return row >= 0 && col >= 0 && row < visited.length && col < visited[0].length
				&& !visited[row][col] && maps[row][col] != 0;
	}
}