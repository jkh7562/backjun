import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean check[][] = new boolean[101][101]; //2차원 배열 만들어줌
        int x1, x2, y1, y2; // 각각 좌표 값

        for(int i = 0; i < 4; i++) { //도형 4개 만들때까지 반복
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            for(int j = x1; j < x2; j++) { //x좌표 구함
                for(int k = y1; k < y2; k++) { // y좌표 구함
                    check[j][k] = true; //해당 x좌표와 y좌표에 체킹함
                }
            }
        }

        int cnt = 0;
        for(int i = 1; i < check.length; i++) { //체킹한 갯수 카운트
            for(int j = 1; j < check.length; j++) {
                if(check[i][j] == true) cnt++;
            }
        }

        System.out.println(cnt); //체킹 갯수 출력
    }
}