import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<arr.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            System.out.print(arr[i] - n + " ");
        }
        
        bf.close();
    }
}