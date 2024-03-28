import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        
        if(x>0 && y>0) System.out.println("1");
        if(x<0 && y>0) System.out.println("2");
        if(x<0 && y<0) System.out.println("3");
        if(x>0 && y<0) System.out.println("4");
        
        bf.close();
    }
}