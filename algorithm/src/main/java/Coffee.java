import java.util.Scanner;

public class Coffee {
    public int solution() {
        int totalSum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("coffee insert : 0 quit");
            System.out.println("1 : americano , 2 : latte , 3 : caramel makiyato , 4: espresso");
            int num = scanner.nextInt();
            if (num == 0) {
                flag = false;
            }
            switch (num) {
                case 1:
                    totalSum += 1500;
                    break;
                case 2:
                    totalSum += 2000;
                    break;
                case 3:
                    totalSum += 2500;
                    break;
                case 4:
                    totalSum += 3000;
                    break;

                default:
                    System.out.println("no menu.");
            }
        }
        return totalSum;
    }
        public static void main(String[] args) {
        Coffee t = new Coffee();
        System.out.println("coffee total : " + t.solution());
    }
}
