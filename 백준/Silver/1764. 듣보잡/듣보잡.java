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
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<N; i++) {
            String noLisenNm = bf.readLine();
            map.put(noLisenNm, i);
        }
        
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<M; i++) {
            String noSeeNm = bf.readLine();
            if(map.containsKey(noSeeNm)) {
            	result.add(noSeeNm);
            }
        }
        
        Collections.sort(result);
        
        sb.append(result.size()).append('\n');
        for(String name : result) {
        	sb.append(name).append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
}