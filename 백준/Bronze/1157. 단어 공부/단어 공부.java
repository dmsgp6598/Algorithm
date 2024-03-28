import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine().toUpperCase();
        int[] arr = new int[26];
        
        for(int i=0; i<S.length(); i++) {
            int n = S.charAt(i) - 'A';
            arr[n]++;
        }

        int max = 0;
        char c = '?';
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                c = (char)(i+'A');
            }else if(max == arr[i]) {
                c = '?';
            }
        }
        
        bf.close();
        System.out.println(c);
    }
}