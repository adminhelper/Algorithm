package 프로그래머스.레벨0;

public class 순서쌍의개수 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
