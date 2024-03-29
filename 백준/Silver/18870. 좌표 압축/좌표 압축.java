import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int cnt = 0;
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] temp = arr.clone();
        
        Arrays.sort(arr);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], cnt++);
            }
        }
        
        for(int i=0; i<N; i++) {
            sb.append(map.get(temp[i])).append(" ");
        }
        
        bf.close();
        System.out.println(sb);
    }
}