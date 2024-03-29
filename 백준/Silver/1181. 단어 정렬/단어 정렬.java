import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        String[] arr = new String[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = bf.readLine();
        }
        
        Arrays.sort(arr, (str1, str2) -> {
            if(str1.length() == str2.length()) {
                return str1.compareTo(str2);
            }else {
                return str1.length() - str2.length();
            }
        });
        
        sb.append(arr[0]).append('\n');
        
        for(int i=1; i<N; i++) {
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        bf.close();
        System.out.println(sb);
    }
}