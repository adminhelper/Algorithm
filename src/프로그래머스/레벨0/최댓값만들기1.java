package 프로그래머스.레벨0;

import java.util.Arrays;

public class 최댓값만들기1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}
