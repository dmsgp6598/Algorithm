import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bf.readLine());
        
        if(a%4==0 && (a%100!=0 || a%400==0)) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        
        bf.close();
    }
}