import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int max = 0;
        int line = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            
            if(arr[i] > max) {
                max = arr[i];
                line = i+1;
            }
        }
        
        bf.close();
        System.out.println(max);
        System.out.println(line);
    }
}