import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        int Max = 0;
        
        for(int i=0; i<arr.length; i++) {
            String str = bf.readLine();
            Max = Math.max(Max, str.length());
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        
        for(int i=0; i<Max; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
        bf.close();
    }
}