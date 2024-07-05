package programmers_258712;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] friends = new String[] {"a", "b", "c"};
        String[] gifts = new String[] {"a b", "b a", "c a", "a c", "a c", "c a"};

        int answer = s.solution(friends, gifts);

        System.out.println(answer);
    }
}
