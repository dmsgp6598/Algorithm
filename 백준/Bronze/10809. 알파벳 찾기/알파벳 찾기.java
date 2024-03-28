import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }
        
        String S = bf.readLine();
        
        for(int j=0; j<S.length(); j++) {
            char ch = S.charAt(j);
            
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = j;
            }
        }
        
        for(int a : arr) {
            System.out.print(a + " ");
        }
        bf.close();
    }
}