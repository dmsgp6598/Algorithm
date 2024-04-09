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
        
        for(int i=0; i<T; i++) {
            String str = bf.readLine();
            if(str.equals("ENTER")) {
                hset = new HashSet<>();
            }else {
                if(!hset.contains(str)) {
                    hset.add(str);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}