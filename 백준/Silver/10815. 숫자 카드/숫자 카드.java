import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       
        int N = Integer.parseInt(bf.readLine());
        
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<N; i++) {
            map.put(Integer.parseInt(st.nextToken()),i);
        }
        
        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i=0; i<M; i++) {
            if(map.containsKey(Integer.parseInt(st.nextToken()))) {
                sb.append(1).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }
        bf.close();
        System.out.println(sb);
    }
}