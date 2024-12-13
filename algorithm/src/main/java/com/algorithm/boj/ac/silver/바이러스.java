package com.algorithm.boj.ac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 바이러스 {

    static boolean [] visited ;
    static List[] computers;
    static int N,connections,count;
    static StringTokenizer st;

    static void dfs (int start){
        if (!visited[start] == true){
            visited[start] = true;
            count ++;
            for (int i = 0 ; i < computers[start].size(); i ++) {
                dfs((Integer) computers[start].get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        N = Integer.parseInt(br.readLine());
        visited = new  boolean[N+1];
        computers = new List[N+1];
        connections = Integer.parseInt(br.readLine());
        for (int i = 1 ; i < N+1 ; i++) {
            computers[i] = new ArrayList<>();
        }
        for (int i = 0 ; i < connections; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computers[a].add(b);
            computers[b].add(a);
        }
        count = 0;
        dfs(1);

        System.out.println(count-1);
    }
}

