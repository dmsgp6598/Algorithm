import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        Map<String, Integer> hmap = new HashMap<>();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<N; i++) {
            String str = bf.readLine();
            if(str.length() >= M) {
                hmap.put(str, hmap.getOrDefault(str, 0) + 1);
            }
        }
        
        List<String> wordList = new ArrayList<>(hmap.keySet());
        
        Collections.sort(wordList, (str1, str2) -> {
           //자주 나오는 단어순으로 정렬
           if(Integer.compare(hmap.get(str1), hmap.get(str2)) != 0) {
               return Integer.compare(hmap.get(str2), hmap.get(str1));
           };
           //해당 단어의 길이가 길수록
           if(str1.length() != str2.length()) {
               return str2.length() - str1.length();
           }
           //알파벳 사전 순
           return str1.compareTo(str2);
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s : wordList) {
            sb.append(s).append('\n');
        }
        
        bf.close();
        System.out.println(sb);
        
    }
}