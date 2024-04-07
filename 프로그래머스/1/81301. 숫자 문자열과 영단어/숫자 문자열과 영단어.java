class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] ch = s.toCharArray();
        int idx = 0;
        
        while(idx <= s.length()-1) {
            switch(ch[idx]) {
                case 'z' : 
                    sb.append(0); 
                    idx += 4;
                    break;
                case 'o' : 
                    sb.append(1); 
                    idx += 3;
                    break;
                case 't' : 
                    if(ch[idx+1] == 'w') {
                        sb.append(2);
                        idx += 3;
                        break;
                    }else {
                        sb.append(3);
                        idx += 5;
                        break;
                    }
                case 'f' : 
                    if(ch[idx+1] == 'o') {
                        sb.append(4);
                        idx += 4;
                        break;
                    }else {
                        sb.append(5); 
                        idx += 4;
                        break;
                    }
                case 's' : 
                    if(ch[idx+1] == 'i') {
                        sb.append(6); 
                        idx += 3;
                        break;
                    }else {
                        sb.append(7); 
                        idx += 5;
                        break;
                    }
                case 'e' : 
                    sb.append(8); 
                    idx += 5;
                    break;
                case 'n' : 
                    sb.append(9); 
                    idx += 4;
                    break;
                default : 
                	sb.append(ch[idx]); 
                	idx++;
                	break; 
            }
        }
        return Integer.parseInt(sb.toString());
    }
}