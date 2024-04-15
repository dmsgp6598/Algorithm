import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int cnt;
    
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<N; i++) {
            cnt = 0;
            sb.append(isPalindrome(bf.readLine()) + " " + cnt).append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
}

