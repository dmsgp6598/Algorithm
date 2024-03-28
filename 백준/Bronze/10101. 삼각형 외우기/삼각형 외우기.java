import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        int sum = A + B + C;
        
        if(sum == 180) {
            if(A == B && B == C)System.out.println("Equilateral"); 
            else if(A==B || B==C || A==C) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }else {
            System.out.println("Error");
        }
        bf.close();
    }
}