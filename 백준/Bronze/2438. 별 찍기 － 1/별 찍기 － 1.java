import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(bf.readLine());
                
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}