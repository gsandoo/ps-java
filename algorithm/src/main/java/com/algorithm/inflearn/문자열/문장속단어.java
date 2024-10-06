package com.algorithm.inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문장 내 가장 긴 단어 출력
// 핵심:
// 길이를 구해 단어 추출 => 단순 구현. 이전 길이를 담는 변수 생성할 것
public class 문장속단어 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int cnt = 0;
        String words = "";
        for (String x : str){
            int len = x.length();
            if (len > cnt){
                cnt = len;
                words = x;
            }
        }
        System.out.println(words);
    }
}
