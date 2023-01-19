package 프로그래머스.레벨0;

import java.util.Arrays;

public class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array.length / 2;
        return array[answer];
    }
}
