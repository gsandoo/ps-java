package codingtest;

import java.util.Scanner;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String[]str = s.toLowerCase().split("");
        boolean flag = true;
        for (String x: str
             ) {
            answer += flag ?x.toUpperCase() :x ;
            flag = x.equals(" ") ?true :false;
        }
        return answer;
    };

    public static void main(String[] args) {
        JadenCase T = new JadenCase();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
}
