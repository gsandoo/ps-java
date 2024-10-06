package com.algorithm.inflearn.section6.올바른괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static String solution(char[] ch) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char cha : ch) {
            if (cha == '(') stack.push(cha);
            else {
                if (stack.isEmpty()) {
                    return  "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty())answer = "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();

        char[] ch = words.toCharArray();

        System.out.println(solution(ch));
    }
}
