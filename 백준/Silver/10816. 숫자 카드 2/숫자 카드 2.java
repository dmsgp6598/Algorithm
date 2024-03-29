import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr); //이진/이분 탐색을 위해 먼저 정렬 해준다.
            
        int M = Integer.parseInt(bf.readLine());
        
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<M; i++) {
            int value = Integer.parseInt(st.nextToken()); //찾으려는 값
            bw.write(findEndIndex(arr, value) - findStartIndex(arr, value) + " ");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
    
    public static int findStartIndex(int[] arr, int value) {
        int left = 0;
        int right = arr.length; // 찾으려는 값의 마지막 인덱스+1 - 첫번째 인덱스를 해서 개수를 구할것이기 때문에 right 값에 마지막 인덱스가 아닌 배열 길이를 넣어준다.
        
        while(left < right) {
            int middle = (left + right) / 2; //중앙 값을 구해준다.
            if(value <= arr[middle]) { //찾으려는 수가 middle 위치의 값보다 왼쪽에 있는지 오른쪽에 있는지를 찾기 위해서
                right = middle; //찾으려는 수가 middle 보다 작다는 말은 왼쪽에 있다는 말이므로 right를 옮겨준다.
            }else {
                left = middle + 1; //찾으려는 수가 middle 크니깐 left를 middle 위치 한칸 옆으로 옮겨준다.
            }
        }
        return left;
    }
    
    public static int findEndIndex(int[] arr, int value) {
        int left = 0;
        int right = arr.length; // 찾으려는 값의 마지막 인덱스+1 - 첫번째 인덱스를 해서 개수를 구할것이기 때문에 right 값에 마지막 인덱스가 아닌 배열 길이를 넣어준다.
        
        while(left < right) {
            int middle = (left + right) / 2; //중앙 값을 구해준다.
            if(value < arr[middle]) {
                right = middle; 
            }else {
                left = middle + 1; 
            }
        }
        return left;
    }
}
