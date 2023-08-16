package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class cutstring {

    public int solution(String s) {
        int answer = 0 ,lt = 0  ,c = 1 , nc=0 ;
        if (s.length() <= 1) {
            answer++;
            return answer;
        }
        for (int rt = 1  ; rt < s.length() ; rt++){
            char x = s.charAt(lt);
            if (x != s.charAt(rt))nc++;
            else c++;
            if (c == nc){
                answer++;
                s = s.substring(rt+1);
                rt=0;
                c=1;
                nc=0;
            }
        }
        if (s.length() >=1 ) answer++;
        return  answer;
    };

    public static void main(String[] args) {
        cutstring T = new cutstring();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
        }
    }

