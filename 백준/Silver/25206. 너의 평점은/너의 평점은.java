import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
    
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        double totGrade = 0; //전공과목별 합
        double totScore = 0; //학점의 총합
        
        
        for(int i=0; i<20; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            String sub = st.nextToken(); //과목
            double score = Double.parseDouble(st.nextToken()); //학점
            String str = st.nextToken(); //등급
            double grade = 0; //등급에 맞는 점수
            
            if(!str.equals("P")){
                switch(str){
                    case "A+" :
                        grade = 4.5;
                        break;
                    case "A0" :
                        grade = 4.0;
                        break;
                    case "B+" :
                        grade = 3.5;
                        break;
                    case "B0" :
                        grade = 3.0;
                        break;
                    case "C+" :
                        grade = 2.5;
                        break;  
                    case "C0" : 
                        grade = 2.0;
                        break;
                    case "D+" :
                        grade = 1.5;
                        break;
                    case "D0" :
                        grade = 1.0;
                        break;
                    case "F" : 
                        grade = 0.0;
                        break;
                    }
                
                    totGrade += score * grade;
                    totScore += score;
                }
            
            }
            bf.close();
            System.out.printf("%.6f", totGrade/totScore);
        }
        
    }
