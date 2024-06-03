package com.example.algorithm.ssafy.D3;

import java.util.ArrayList;
import java.util.Scanner;

/*1206. [S/W 문제해결 기본] 1일차 - View*/
public class Test1 {
    public static void main(String args[]) throws Exception {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        //System.setIn(new FileInputStream("res/sample_input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int k = 1; k <= 10; k++) {
            int T;
            T = sc.nextInt();

            sc.nextLine();
            String input = sc.nextLine();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < T; j++) {
                String[] values = input.split(" ");
                arrayList.add(Integer.parseInt(values[j]));
            }
            int result = 0;
            // 층 계산
            for (int i = 0; i < arrayList.size(); i++) {
                // 0 은제거
                if (arrayList.get(i).equals(0)) continue;
                    // 0 이 아닌 경우
                else {
                    if ((arrayList.get(i) > arrayList.get(i - 1) && arrayList.get(i) > arrayList.get(i + 1)) && (arrayList.get(i) > arrayList.get(i - 2) && arrayList.get(i) > arrayList.get(i + 2))) {
                        int biggerA = Integer.max(arrayList.get(i - 1), arrayList.get(i - 2));
                        int biggerB = Integer.max(arrayList.get(i + 1), arrayList.get(i + 2));
                        int bigger = Integer.max(biggerA, biggerB);

                        result += arrayList.get(i) - bigger;
                    }
                }
            }

            list.add("#"+k+ " " + result);
        }

        for (int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
