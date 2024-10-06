package com.algorithm.inflearn.배열;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 중복 문자 제거
// 핵심:
// sb.indexOf(String.valueOf(str.charAt(i)))<0  ----> 특정 문자로 sb에서 인덱스를 찾는데 0 이하다 => sb에 문자가 없다!
// 고로 sb에 append 해라.


public class 중복문자제거 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++){
            if (sb.length() == 0){
                sb.append(str.charAt(i));
            }
            else{
                if (sb.indexOf(String.valueOf(str.charAt(i)))<0){
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}

