package 프로그래머스.레벨0;

public class 분수의덧셈못품 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        // 첫번째 denum1 분자 , num1 분모
        // 두번째 denum2 분자 , num2 분모

        int[] answer = new int[2];

        int top = denum1 * num2 + denum2 * num1;
        int bottom = num1 * num2;


        answer[0] = denum1 * num2 + denum2 * num1;
        answer[1] = num1 * num2;

        return answer;
    }
}


