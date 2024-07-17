package programmers_42576;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = s.solution(participant, completion);

        System.out.println(answer);
    }
}
