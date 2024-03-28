import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
        
        int sum = 0;
        
        for(byte b : bf.readLine().getBytes()) {
            sum += (b-'0');
        }
        
        System.out.println(sum);
        bf.close();
       
    }
}