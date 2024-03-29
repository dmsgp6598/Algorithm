import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(bf.readLine(), " ");
        	String name = st.nextToken();
        	String str = st.nextToken();
        	if(map.containsKey(name)) {
        		map.remove(name);
        	}else {
        		map.put(name, str);
        	}
        }
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String nm : list) {
        	sb.append(nm).append(" ");
        }
       System.out.println(sb);
        
    }

}
