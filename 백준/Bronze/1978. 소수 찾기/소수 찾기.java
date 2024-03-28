import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		bf.readLine();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		while(st.hasMoreTokens()) {
        
			// 소수인경우 true, 아닌경우 false   
			boolean primeNum = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					primeNum = false;
					break;
				}
			}
			if(primeNum) {
				count++;
			}
		}
        bf.close();
		System.out.println(count);
	}
 
}