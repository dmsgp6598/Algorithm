import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[30];
        
        for(int i=0; i<28; i++) {
            int n = Integer.parseInt(bf.readLine());
            arr[n-1] = 1;
        }
        
        for(int j=0; j<arr.length; j++) {
            if(arr[j] != 1) {
                System.out.println(j+1);
            }
        }
        bf.close();
    }
}