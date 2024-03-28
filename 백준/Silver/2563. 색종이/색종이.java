import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];
        int cnt = Integer.parseInt(bf.readLine());
        int num = 0;
        StringTokenizer st;
        
        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            for(int j=n; j<n+10; j++) {
                for(int k=m; k<m+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] == 1) {
                    num += 1;
                }
            }
        }
        
        bf.close();
        System.out.println(num);
    }
}