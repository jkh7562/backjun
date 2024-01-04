import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        int X = Rev(x);
        int Y = Rev(y);

        int r = X+Y;
        int R = Rev(r);

        System.out.println(R);

    }

    private static int Rev(int N){ //자리수 바꾸는 함수
        String str = "";//초기화
        while(N>0){
            str += N % 10; //끝자리 구해서 앞에다 넣음
            N /= 10; //끝자리 하나 없앰
        }
        return Integer.parseInt(str);
    }
}
