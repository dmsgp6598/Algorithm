import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static boolean[][] arr;
    public static int min = 64;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new boolean[N][M];
        
        for(int i=0; i<N; i++) {
            String str = bf.readLine();
            for(int j=0; j<M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        
        for(int i=0; i<=N-8; i++) {
            for(int j=0; j<=M-8; j++) {
                check(i,j);
            }
        }
        System.out.println(min);
    }
    
    public static void check(int x, int y) {
        int count = 0;
        boolean chk = arr[x][y];
        
        for(int i=x; i<x+8; i++) {
            for(int j=y; j<y+8; j++) {
                if(chk != arr[i][j]) {
                    count++;
                }
                chk = (!chk);
            }
            chk = (!chk);
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}