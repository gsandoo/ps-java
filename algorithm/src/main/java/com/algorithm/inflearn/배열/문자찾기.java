package com.algorithm.inflearn.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// section1.1 문자 찾기

// 핵심:
// 1. 문자열 to char [] => br.toCharArray
// 2. 문자 받는 법 => (char)br.read()
// 3. 옵션 => 어퍼케이스는 Character.toUpperCase / br.readline().toUpperCase()
class 문자찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        char[] str = br.readLine().toUpperCase().toCharArray();
        char alpha = Character.toUpperCase((char)br.read());

        for (char x: str){
            if (x == alpha){
              answer++;
            }
        }
        System.out.println(answer);
    }
}