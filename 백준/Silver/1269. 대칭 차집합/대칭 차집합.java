import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); //A 집합 개수
        int B = Integer.parseInt(st.nextToken()); //B 집합 개수
        
        HashSet<Integer> hset = new HashSet<Integer>();
        
        st = new StringTokenizer(bf.readLine()); //A의 원소들을 받는다
        for(int i=0; i<A; i++) { //A의 원소들 hashSet에 저장
            hset.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(bf.readLine()); //B의 원소들을 받는다
        for(int i=0; i<B; i++) { //B의 원소들 hashSet에 저장
            hset.add(Integer.parseInt(st.nextToken()));
        }
        
        bf.close();
        //hashSet에 저장하면 중복값은 알아서 제거해서 저장된다.
        //A와 B 합친 원소에서 B를 빼주면 A 차집합이, A를 빼주면 B 차집합이 된다.
        System.out.println((hset.size() - B) + (hset.size() - A));
    }
}