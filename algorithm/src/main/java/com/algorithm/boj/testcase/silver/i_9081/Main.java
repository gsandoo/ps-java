package com.algorithm.boj.testcase.silver.i_9081;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static ArrayList<String>  solution(ArrayList<String> words){

        ArrayList<String> answer = new ArrayList<>();

        for (String word : words){
            boolean changed = false;
            int index = 0 ;

            char[] wchar  = word.toCharArray();

            for (int i = wchar.length-1 ; i > 0 ; i--){

                for (int j = i-1 ; j >= 0 ; j-- ){
                    if (wchar[i] > wchar[j]){
                        char tmp = wchar[i];
                        wchar[i] = wchar[j];
                        wchar[j] = tmp;

                        changed = true;
                        index = j+1;
                    }
                    if (changed)break;
                }
                if (changed) break;
            }
            if (changed){
                Arrays.sort(wchar,index,wchar.length);
            }
            answer.add(String.valueOf(wchar));

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T ; i++){
            String token = br.readLine();
            words.add(token);
        }

        words = solution(words);

        for (String word : words) System.out.println(word + '\n');
    }
}
