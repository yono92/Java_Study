package com.algorithm.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo6014 {
    public static void main(String[] args) {
        System.out.println("0614 알고리즘 시작");
//        int[] arr = {5, 9, 7, 10};
//        System.out.println(Arrays.toString(solution1(arr, 5)));
//        System.out.println(solution2("a234"));
//        System.out.println(solution3(3));
//        System.out.println(solution4("AB", 1));
//        System.out.println(solution5("try hello world"	));
//        String[] souel = {"jane", "Kim"};
//        System.out.println(solution6(souel));
//        System.out.println(solution7("-1234"));
//        System.out.println(solution8(10));
//        System.out.println(solution9("Zbcdefg"));
//        int[] lottos = {1, 2, 3, 4, 5, 6};
//        int[] win_nums = {2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(solution11(lottos,win_nums)));
        int[] answer = {1, 2, 3, 4, 5};
    }

    /*
    문제 설명
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     */
    public static int[] solution1(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for (int n: list) {
            answer[size++] = n;
        }
        Arrays.sort(answer);
        return answer;
    }

    /*
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     */
    public static boolean solution2(String s) {
        boolean answer = true;
        final String REGEX = "[0-9]+";
        if (s.length() == 4 || s.length() == 6) {
            if (!s.matches(REGEX)) {
                answer = false;
            }
        } else {
            answer = false;
        }
        return answer;
    }


    public static String solution3(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
    /*
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
    "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
     */
    public static String solution4(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            if(ch>='a' && ch<='z') { //소문자
                if(ch+n > 'z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            }else if(ch>='A' && ch<='Z') { //대문자
                if(ch+n > 'Z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }

    public static String solution5(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += ' ';
                idx = 0;
                continue;
            }
            if (idx % 2 == 0) {
                idx++;
                answer += String.valueOf(Character.toUpperCase(ch));
            } else {
                idx++;
                answer += String.valueOf(Character.toLowerCase(ch));
            }
        }
        return answer;
    }

    public static String solution6(String[] seoul) {
        String answer = "";
//        for (int i = 0; i < seoul.length; i++) {
//            if (seoul[i].equals("Kim")) {
//                answer += "김서방은 "+i+"에 있다.";
//            }
//        }
        answer += "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
        return answer;
    }

    public static int solution7(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
    /*
    소수 찾기
    문제 설명
    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
    소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)
     */
    public static int solution8(int n) {
        int answer = 0;
        boolean[] prime = new boolean [n+1];
        for(int i=2; i<=n ; i++)
            prime[i]=true; //2~n번째수를 true로 초기화
        //제곱근 구하기
        int root=(int)Math.sqrt(n);
        for(int i=2; i<=root; i++){ //2~루트n까지 검사
            if(prime[i]==true){ //i번째의 수가 소수일 때
                for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문)
                    prime[i*j]=false;
            }
        }
        for(int i =2; i<=n; i++) {
            if(prime[i]==true)
                answer++;
        }
        return answer;
    }

    /*
    문제 설명
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     */
    public static String solution9(String s) {
        char[] chararr = s.toCharArray();
        Arrays.sort(chararr);
        StringBuilder sb = new StringBuilder(new String(chararr, 0, chararr.length));
        return sb.reverse().toString();
    }

    /*
    S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
    그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
    물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
    예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
    부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
    최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution10(int[] d, int budget) {
        int answer = 0;
        return answer;
    }
    /*
    로또의 최고 순위와 최저 순위
     */
    public static int[] solution11(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int zeroCnt = 0;

        Arrays.sort(lottos);
        for(int i = 0; i < 6; i++) {
            if(lottos[i] != 0) break;
            zeroCnt++;
        }

        Arrays.sort(win_nums);
        for(int j = 0; j < 6; j++) {
            for(int k = zeroCnt; k < 6; k++) {
                if(win_nums[j] != lottos[k])    continue;
                answer[0]++;
                answer[1]++;
            }
        }

        answer[0] += zeroCnt;

        for(int i = 0; i < 2; i++) {
            if(answer[i] == 6) answer[i] = 1;
            else if(answer[i] == 5) answer[i] = 2;
            else if(answer[i] == 4) answer[i] = 3;
            else if(answer[i] == 3) answer[i] = 4;
            else if(answer[i] == 2) answer[i] = 5;
            else answer[i] = 6;
        }

        return answer;
    }

    public int[] solution12(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = {0,0,0}; // 수포자들 답 맞은 개수
        // 비교
        for(int i = 0; i < answers.length; i++){
            if(first[i % 5] == answers[i]){ scores[0]++;}
            if(second[i % 8] == answers[i]){ scores[1]++;}
            if(third[i % 10] == answers[i]){ scores[2]++;}
        }

        int[] arr = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            arr[i] = scores[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}
