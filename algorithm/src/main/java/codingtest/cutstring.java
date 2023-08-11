package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class cutstring {

    public int solution(String s) {
        String as = s;
        int answer = 0 , i = 0 , c=0 , d = 1;
        while (!as.equals("")){
            if (as.length() <=1){
                as = as.substring(c);
                answer++;
                break;
            }
            if (as.charAt(i) != as.charAt(i+1)){
                c++;
            }else {
                i++;
                d++;
            }
            if (c == d){
                as = as.substring(c+1);
                answer++;
                d=1;
                c=0;
            }
        }

        return  answer;
    };

    public static void main(String[] args) {
        cutstring T = new cutstring();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
        }
    }

