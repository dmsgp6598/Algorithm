import java.io.*;
import java.util.*;

class Solution {
    static int answer = -1;
	static boolean[][] visited;
	static int[] mrow = {-1, 1, 0 , 0};
	static int[] mcol = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        
        bfs(0, 0, maps);
        
        return answer;
    }
    
    public void bfs(int row, int col, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0, 1));
		
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			if(cur.row == maps.length-1 && cur.col == maps[0].length-1) {
				answer = cur.cnt;
				return;
			}
			
			for(int i=0; i<4; i++) {
				int nextRow = cur.row + mrow[i];
				int nextCol = cur.col + mcol[i];
				
				if(chkNode(nextRow, nextCol, maps)) {
					visited[nextRow][nextCol] = true;
					q.add(new Node(nextRow, nextCol, cur.cnt+1));
				}
				
			}
			
		}
		
	}
    
    class Node {
		int row;
		int col;
		int cnt;
		
		public Node(int row, int col, int cnt) {
			this.row = row;
			this.col = col;
			this.cnt = cnt;
		}
	}
    
    public boolean chkNode(int row, int col, int[][] maps) {
        return row >= 0 && row < visited.length && col >= 0 && col < visited[0].length
                    && !visited[row][col] && maps[row][col] != 0;
    }
}