import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[8001];
        
        
        double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(bf.readLine());
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
        
		int count = 0;
		int mode_max = 0;
		
		boolean flag = false;
        
		 for(int i = min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				if(count < (N + 1) / 2) {
					count += arr[i];
					median = i - 4000;
				}
				
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	
				}
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
        sb.append(Math.round(sum/N)).append('\n');
        sb.append(median).append('\n');
        sb.append(mode).append('\n');
        sb.append(max - min).append('\n');
        
        System.out.println(sb);
    }
    
}
