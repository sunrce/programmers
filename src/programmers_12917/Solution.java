package programmers_12917;

class Solution {
    public String solution(String s) {
        /*
        * 삽입정렬로 해결
        * @var tmp      삽입정렬에서 비교할 값 - 2번째부터 마지막 번째까지 바뀜
        * @var index    이미 비교가 된 값이 들어갈 위치

        */
        String answer = "";

        char[] c = s.toCharArray();
        char tmp;

        int index;

        for (int i=1; i<c.length; i++) {
            tmp = c[i];
            index = i;

            for (int j=i-1; j>=0; j--) {

                if (tmp > c[j]) {

                    c[j + 1] = c[j];
                    index--;

                }

                c[index] = tmp;
            }

        }

        answer = new String(c);

        return answer;
    }
}
