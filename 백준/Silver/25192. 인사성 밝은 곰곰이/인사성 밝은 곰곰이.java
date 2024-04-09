import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<String> hset = new HashSet<>();
        
        int T = Integer.parseInt(bf.readLine());
        int cnt = 0;
        
        while(T-- > 0) {
            String str = bf.readLine();
            if(str.equals("ENTER")) {
                cnt += hset.size();
                hset = new HashSet<>();
            }else {
                hset.add(str);
            }
        }
        
        cnt += hset.size();
        
        System.out.println(cnt);
    }
}