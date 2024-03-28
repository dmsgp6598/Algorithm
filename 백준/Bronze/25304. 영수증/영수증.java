import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int price = 0;
        
        StringTokenizer st;
        
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            price += (a*b);
        }
        
        if(X == price) System.out.println("Yes");
        else System.out.println("No");
    }
}