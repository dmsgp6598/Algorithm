import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(bf.readLine());
        int sum = 0; //이전 대각선까지의 총 칸의 수
        int cnt = 1; //대각선에 있는 칸의 수
        
        while(true) {
            if(X <= (sum + cnt)) {
                if(cnt % 2 == 1) { //대각선에 있는 칸의 수가 홀수라면 분자는 작아지고, 분모는 커짐
                    System.out.println((cnt - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }else { //대각선에 있는 칸의 수가 짝수라면 분자는 커지고, 분모는 작아짐
                    System.out.println((X - sum) + "/" + (cnt - (X - sum - 1)));
                    break;
                }
            }else {
                sum += cnt;
                cnt++;
            }
        }
        bf.close();    
    }
}