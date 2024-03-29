import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, String> hmap_str = new HashMap<Integer, String>();
        HashMap<String, Integer> hmap_int = new HashMap<String, Integer>();
        
        for(int i=1; i<=N; i++) {
            String str = bf.readLine();
            hmap_str.put(i, str);
            hmap_int.put(str, i);
        }
        
        for(int i=0; i<M; i++) {
            String str = bf.readLine();
            if(isNum(str)) {  //숫자이면
                bw.write(hmap_str.get(Integer.parseInt(str)) + "\n");
            }else { //문자라면
                bw.write(hmap_int.get(str) + "\n");
            }
                
        }
        bf.close();
        bw.flush();
        bw.close();
    }
    
    public static boolean isNum(String S) {
        if (Character.isDigit(S.charAt(0))) {
            return true;
        }else {
            return false;
        }
    }
}