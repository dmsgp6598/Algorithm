import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int grade = Integer.parseInt(bf.readLine());
        
        System.out.print((grade>=90) ? "A" : (grade>=80) ? "B" : (grade>=70) ? "C" : (grade>=60) ? "D" : "F" );

        bf.close();
    }
}