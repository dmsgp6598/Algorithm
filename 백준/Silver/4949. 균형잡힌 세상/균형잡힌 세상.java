import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        
        while(true) {
        	String result="";
            str = bf.readLine();
            
            if(str.equals(".")) {
                break;
            }
            
            char[] arr = new char[str.length()];
            int size = 0;
            
            for(char c : str.toCharArray()) {
                if(c == '(' || c == '[') {
                    arr[size] = c;
                    size++;
                }else if(c == ')') {
                    if(size == 0 || arr[size-1] != '(') {
                        result = "no";
                        break;
                    }else {
                        size--;
                    }
                }else if(c == ']') {
                    if(size == 0 || arr[size-1] != '[') {
                        result = "no";
                        break;
                    }else {
                        size--;
                    }
                }
            }
            if(result.equals("no")) sb.append("no").append('\n');
            else if(size == 0) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }
        bf.close();
        System.out.println(sb);
    }
}