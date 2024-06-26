import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String st = bf.readLine();
        int cnt = 0;
        int len = st.length();
        
        for(int i=0; i < len; i++) {
            char ch = st.charAt(i);
            
            if(ch == 'c') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == '=' || st.charAt(i+1) == '-') {
                        i++;
                    }
                }
            }
            
            else if(ch == 'd') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == 'z') {
                        if(i < (len - 2)) {
                            if(st.charAt(i+2) == '=') {
                                i += 2;
                            }
                        }
                    }else if(st.charAt(i+1) == '-') {
                        i++;
                    }
                }
            }
            
            else if(ch == 'l') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == 'j') {
                        i++;
                    }
                }
            }
            
            else if(ch == 'n') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == 'j') {
                        i++;
                    }
                }
            }
            
            else if(ch == 's') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == '=') {
                        i++;
                    }
                }
            }
            
            else if(ch == 'z') {
                if(i < (len - 1)) {
                    if(st.charAt(i+1) == '=') {
                        i++;
                    }
                }
            }
            
            cnt++;
        }
        
        bf.close();
        System.out.print(cnt);
    }
}