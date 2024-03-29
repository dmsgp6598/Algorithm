import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        String[][] arr = new String[N][2];
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        
        Arrays.sort(arr, (arr1, arr2) -> {
            if(arr1[0] == arr2[0]) {
                return 1;
            }else {
                return Integer.parseInt(arr1[0]) - Integer.parseInt(arr2[0]);
            }
        });
        
       for(int i=0; i<N; i++) {
           sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
}