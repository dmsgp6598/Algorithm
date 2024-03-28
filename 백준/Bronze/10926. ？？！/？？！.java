import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bf.readLine();
        
        System.out.println(s + "??!");
        
        bf.close();
        
    }
}