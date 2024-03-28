import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int Max = 0, N = 0, M = 0;
        StringTokenizer st;
            
        for(int i=0; i<9; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(Max < arr[i][j]) {
                    Max = arr[i][j];
                    N = i;
                    M = j;
                }
            }
        }
        System.out.println(Max);
        System.out.println((N+1) + " " + (M+1));
    }
}