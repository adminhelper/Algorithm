package 프로그래머스.레벨0;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        int[] answer;
        int count = 0;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}
