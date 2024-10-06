package com.algorithm.inflearn.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자 대소문자 바꿔 출력하기
// 핵심:
// 1. toUpperCase(캐릭터), isUpperCase(불리언) 차이 알기
public class 대소문자변환 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }else sb.append(Character.toUpperCase(x));
        }

        System.out.println(sb);
    }
}
