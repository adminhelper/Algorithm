package 프로그래머스.레벨0;

public class 피자나눠먹기3 {
    public int solution(int n, int slice) {
        int answer = 0;

        if(n % 7 == 0)
            answer = n / slice;
        else
            answer = n / slice + 1;
        return answer;
    }
}
