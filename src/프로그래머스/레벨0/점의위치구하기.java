package 프로그래머스.레벨0;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        // +x , +y == 1사분면
        // -x , +y == 2사분면
        // -x , -y == 3사분면
        // +x , -y == 4사분면
        // dot lenght = 2
        // dot[0]은 x좌표 , dot[1]은 y좌표
        int answer = 0;

        if(dot[0] >= 0 && dot[1] >= 0)
            answer = 1;

        else if(dot[0] < 0 && dot[1] >= 0)
            answer = 2;

        else if(dot[0] < 0 && dot[1] < 0)
            answer = 3;

        else if(dot[0] >= 0 && dot[1] < 0)
            answer = 4;

        return answer;
    }
}