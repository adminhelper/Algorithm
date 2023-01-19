package 프로그래머스.레벨0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ch = my_string.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            for(int j = 0; j < n; j++) {
                answer += ch[i];
            }
        }
        return answer;
    }
}
