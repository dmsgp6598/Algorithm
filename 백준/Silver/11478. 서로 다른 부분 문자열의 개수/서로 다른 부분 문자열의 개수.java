import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String str = bf.readLine();
        
        HashSet<String> hset = new HashSet<String>();
        
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                hset.add(str.substring(i,j));
            }
        }
        bf.close();
        System.out.println(hset.size());
    }
}