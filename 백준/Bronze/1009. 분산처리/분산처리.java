import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // 계산 결과를 저장할 변수를 1로 초기화합니다.
            int result = 1;

            // num2만큼 반복하면서 (num1^num2)%10을 계산합니다.
            for (int j = 0; j < num2; j++) {
                result = (result * num1) % 10;
            }

            // 결과가 0인 경우에는 10으로 출력합니다.
            num[i] = result == 0 ? 10 : result;
        }

        for (int j = 0; j < n; j++) {
            System.out.println(num[j]);
        }
    }
}
