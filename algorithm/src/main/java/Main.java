import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(int n , String[] s) {
        String answer = null;
        for(int i = 0 ; i < s.length ; i++){
            for (int j = 0 ; j < s.length ; j ++){
                if (i != j){
                    String a= s[i]+s[j];
                    String b = new StringBuilder(a).reverse().toString();
                    if (a.equals(b)){
                        answer = a;
                    }
                }
            }
        }
        return  answer;
    };

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        for (int i = 0 ; i < m ; i++){
            int n = kb.nextInt();
            String[] s = new String[n];
            for (int j = 0 ; j < n ; j++){
                s[j] = kb.next();
            }
            if (T.solution(n,s) == null){
                System.out.println(0);
            }else System.out.println(T.solution(n,s));
        }
    }
}

