import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt = n;
        
        for(int i=0; i<n; i++) {
            boolean[] arr = new boolean[26];
            int prev = 0;
            String st = bf.readLine();
            
            for(int j=0; j<st.length(); j++) {
                int now = st.charAt(j);
                
                if(prev != now) {
                    if(arr[st.charAt(j) - 'a'] == false) {
                        arr[st.charAt(j) - 'a'] = true;
                        prev = now;
                    }else {
                        cnt--;
                        break;
                    }
                }     
            }
        }
        bf.close();
        System.out.println(cnt);
    }
}