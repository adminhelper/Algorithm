package 프로그래머스.레벨0;

class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--){
            answer = answer + my_string.charAt(i);
        }
        return answer;
    }
}
