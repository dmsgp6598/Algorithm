import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++) {
            map.put(bf.readLine(),i);
        }
        
        for(int i=0; i<M; i++) {
            if(map.containsKey(bf.readLine())) cnt++;
        }
        bf.close();
        System.out.println(cnt);
    }
}