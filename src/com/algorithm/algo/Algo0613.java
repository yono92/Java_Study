package com.algorithm.algo;

import java.util.*;

public class Algo0613 {
    public static void main(String[] args) {
        System.out.println("6월 2주차 알고리즘 시작");
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        System.out.println(Arrays.toString(solution1(arr)));
//        int[] numbers = {2, 1, 3, 4, 1};
//        System.out.println(Arrays.toString(solution2(numbers)));
//        System.out.println(Arrays.toString(solution3(2, 5)));
//        System.out.println(solution4(441));
//        System.out.println(solution5(12));
//        int[] lost = {2, 4};
//        int[] reverse = {1, 3, 5};
//        System.out.println(solution6(5, lost, reverse));
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        System.out.println(solution7(participant, completion));
        System.out.println(solution9("ssibbal"));

    }


    /*
    배열 arr가 주어집니다.
    배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
     */
    public static int[] solution1(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            } else if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    /*
    정수 배열 numbers가 주어집니다.
    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
    모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution2(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                if (list.contains(temp)) continue;
                list.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[list.size()];
        for (int l = 0; l < list.size(); l++) {
            answer[l] = list.get(l);
        }
        Arrays.sort(answer);

        // Set일 이용한 방법
        //        Set<Integer> set = new TreeSet<>();
        //        for (int i = 0; i < numbers.length; i++) {
        //            for (int j = i+1;j < numbers.length; j++) {
        //                set.add(numbers[i] + numbers[j]);
        //            }
        //        }
        //        int[] answer2 = set.stream().mapToInt(Number::intValue).toArray();
        //        Arrays.stream(answer2).sorted();
        //        System.out.println(Arrays.toString(answer2));

        return answer;
    }

    /*
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
    solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
     */

    // 유클리드 호제 사용범

    public static int[] solution3(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


    /*
    문제 설명
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    public static int solution4(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    /*
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
     */
    public static int solution5(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i);
                answer += i;
            }
        }
        return answer;
    }


    /*
    점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
    다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
    학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
    예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
    체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
    전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
    체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
     */
    public static int solution6(int n, int[] lost, int[] reserve) {
        int max = n - lost.length; // 기본적으로 수업에 참여할 수 있는 학생 수

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    max++;
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }

        for (int l : lost) {
            if(l == 0) continue;
            for (int i = 0; i < reserve.length; i++) {
                if(reserve[i] == 0) continue;

                int prev = l - 1; // 이전 번호
                int next = l + 1; // 다음 번호

                if (prev == reserve[i] || next == reserve[i]) {
                    max++;
                    reserve[i] = 0;
                    break;
                }
            }
        }
        return max;
    }

    /*
    완주 못한 사람~~
     */
    public static String solution7(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
    /*
    2016년 1월 1일은 금요일입니다.
    2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
    solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 `SUN,MON,TUE,WED,THU,FRI,SAT`
    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
     */
    public static String solution8(int a, int b) {
//        Calendar calendar = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a-1, b).build();
//        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase(Locale.ROOT);
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }

    /*
    문자열 내 p와 y의 개수
    문제 설명
    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
     */
    public static boolean solution9(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) =='P') {
                p++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }

            if (p == y) {
               answer=  true;
            } else {
                answer= false;
            }
        }
        return answer;
    }
}


