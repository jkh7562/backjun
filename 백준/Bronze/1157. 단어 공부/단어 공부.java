import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26]; // 영문자의 개수
        String s = in.next();

        for (int i = 0; i < s.length(); i++){

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
                arr[s.charAt(i) - 'A']++;	// 첫번째 대문자 알파벳인 A의 아스키 코드 값 65를 빼고 알파벳 순서에 맞게 정렬되게 하고 해당 인덱스의 값 1 증가한다.
            }

            else {	// 소문자 범위
                arr[s.charAt(i) - 'a']++; // 첫번째 소문자 알파벳인 A의 아스키 코드 값 65를 빼고 알파벳 순서에 맞게 정렬되게 하고 해당 인덱스의 값 1 증가한다. 이로써 대문자 소문자 구분하지 않게 됨.
            }
        }


        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) { //알파벳마다 갯수 확인하여 최댓값 구함.
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 실제 아스키 코드 값으로 변환하기 위해 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
