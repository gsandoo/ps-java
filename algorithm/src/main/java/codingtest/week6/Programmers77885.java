package codingtest.week6;

//2개이하로 다른 비트
public class Programmers77885 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int count = 0;
        for (int i = 0 ; i < numbers.length ; i++){
            boolean flag = true;
            int p =1;
            while (flag){
                String a = Integer.toBinaryString((int) (numbers[i] ^ (numbers[i]+p)));
                for (int j = 0 ; j < a.length() ; j++){
                    if (a.charAt(j) == '1'){
                        count ++;
                    }
                }
                if (count <= 2){
                    answer[i] = (long)numbers[i] + p;
                    flag = false;
                    count=0;
                    break;
                }else {
                    p++;
                    count = 0;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers77885 t = new Programmers77885();
        long[] num = { 1001,337,0,1,333,673,343,221,898,997,121,1015,665,779,891,421,222,256,512,128,100 };
        System.out.println(t.solution(num));
    }
}
