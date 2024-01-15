import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
        int len=s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String a = Integer.toBinaryString(s.charAt(i)-'0'); //현재 순서의 정수를 아스키 코드 값의 제일 앞 번호인 0의 아스키 코드로 빼서 문자 값이 아닌 정수 값으로서 계산할 수 있도록 함. 또한 각각의 10진수 정수를 2진수로 변환하기 때문에 8진수 기준으로 계산할 필요가 없어짐. 
            if(a.length()==2 && i!=0) a="0"+a; //첫번째 수가 아니고 길이가 두개라면 앞에 0을 추가
            else if(a.length()==1 && i!=0) a="00"+a; //첫번째 수가 아니고 길이가 한개라면 앞에 0을 두개 추가

            sb.append(a);
        }


        System.out.println(sb);
    }
}
