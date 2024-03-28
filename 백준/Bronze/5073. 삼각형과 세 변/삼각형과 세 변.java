import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            st = new StringTokenizer(bf.readLine(), " ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            
            Arrays.sort(arr);
            
            if(arr[2] >= arr[0] + arr[1]) {
				sb.append("Invalid\n");
			}else if(arr[0] == arr[1] && arr[1] == arr[2]) {
				sb.append("Equilateral\n");
			}else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				sb.append("Isosceles\n");
			}else {
				sb.append("Scalene\n");
			}
        }
        bf.close();
        System.out.println(sb);
    }
}