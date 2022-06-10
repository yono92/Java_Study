package com.algorithm.algo;

import java.util.*;

public class Algo0609 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution2(3,12)));
//        System.out.println(solution4("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(Arrays.toString(solution5(new String[]{"muzi", "frodo", "apeach", "neo"},new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2)));
    }


    /*
    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    2에서 나온 배열의 3번째 숫자는 5입니다.
    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
    commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     */
    public static int[] solution1(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }
    /*
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
     */
    public static int[] solution2(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];

        return answer;

    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }

    public static int solution3(String s) {
        int answer = 0;
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        answer = Integer.valueOf(s);
        return answer;
    }


    //카카오 블라인드 채용 신규유저 아이디 추천
    public static String solution4(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase() // 1
                .replaceAll("[^a-z0-9-_.]", "") // 2
                .replaceAll("[.]{2,}", ".") // 3
                .replaceAll("^[.]|[.]$", ""); // 4
        answer = answer.equals("") ? "a" : answer; // 5
        answer = answer.length() > 15 ? answer.substring(0, 15).replaceAll("[.]$", "") : answer; // 6
        while (answer.length() <= 2) {
            answer += answer.substring(answer.length()-1); // 7
        }
        return answer;
    }

    // 카카오 블라인드 채용 신고 결과 받기
    public static int[] solution5(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];

        /*
         * key 는 유저ID
         * value 는 신고한 유저ID의 set 을 가진 map
         * 동일한 유저ID에 대한 신고횟수는 1회로 처리하기 때문에 중복 허용을 하지 않는 set 을 value 로 사용
         * */
        Map<String, HashSet<String>> reportedMap = new HashMap<>(); // [신고된ID, [신고한ID]]
        Map<String, Integer> answerMap = new HashMap<>(); // [신고된Id, 메일 수]

        /* 1. Map 초기화 */
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportingId = new HashSet<>(); // 신고한ID
            reportedMap.put(id_list[i], reportingId); // 유저ID, 신고한ID 초기 세팅
            answerMap.put(id_list[i], 0);  // 메일 수는 모두 0 으로 초기화
        }
        System.out.println("[STEP 1] reportedMap : " + reportedMap);
        System.out.println("[STEP 1] answerMap : " + answerMap);


        /*
         * 2. 신고 기록 세팅 report 는 "신고한ID 신고된ID" 로 구성됨
         */
        for (String s : report) {
            String[] reportStr = s.split(" ");
            String reportingID = reportStr[0]; // 신고한ID
            String reportedID = reportStr[1]; // 신고된ID
            reportedMap.get(reportedID).add(reportingID); // 신고된ID 를 key 값으로 신고한ID 배열을 value 로 새팅
        }
        System.out.println("[STEP 2] reportedMap 에 신고 기록 세팅 : " + reportedMap);


        /*
         * 3. 유저가 받은 이용 정지 결과 메일 세팅
         */
        for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저
            HashSet<String> userForSend = reportedMap.get(reportedUser); // reportedUser(신고된유저)를 신고한 유저
            if (userForSend.size() >= k) { // 신고된 횟수가 K번 이상일 경우
                for (String userId : userForSend) {
                    answerMap.put(userId, answerMap.get(userId) + 1); // answerMap 에 신고된Id 별 메일 수 넣기
                }
            }
        }
        System.out.println("[STEP 3] answerMap 에 메일 수 세팅 : " + answerMap);


        /*
         * 4. 유저ID 별 받은 메일 수를 answer 에 세팅
         */
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
            System.out.println("[STEP 4] answer : " + answer[i]);
        }

        return answer;
    }
}
