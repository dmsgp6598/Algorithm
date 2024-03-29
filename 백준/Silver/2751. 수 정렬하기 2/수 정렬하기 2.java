import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        
        Collections.sort(list);
        
        for(int num : list) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}