import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        HashSet<String> hset = new HashSet<>();
        hset.add("ChongChong");
        
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            String user1 = st.nextToken();
            String user2 = st.nextToken();
            
            if(hset.contains(user1) || hset.contains(user2)) {
                hset.add(user1);
                hset.add(user2);
            }
        }
        bf.close();
        System.out.println(hset.size());
    }
}