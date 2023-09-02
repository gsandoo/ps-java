package codingtest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class apple {
    public int solution(int k, int m, int[] score) {
        int answer = 0 , min = Integer.MAX_VALUE;

        return answer;
    }

    public static void main(String[] args) {
        apple T = new apple();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt(); //3 , 가장 높은 점수
        int m = kb.nextInt(); //4 , 사과 담는 개수
        int[] score = {1,2,3,1,2,3,1};

        System.out.println(T.solution(k , m , score));
    }
}
