package 프로그래머스.레벨0;

public class 숫자비교하기 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 != num2){
            answer = -1;
        } else {
            answer = 1;
        }
        return answer;
    }
}
