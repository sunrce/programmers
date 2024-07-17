package programmers_42576;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        /*
        * @var participantList  마지막 인원을 구할 때 completion의 요소들을 participant에서 제거하기 위해 arrayList로 변환한다.
        * 참가자 중에서 동명이인이 있을 수 있을 수 있기 때문에 HashSet등 Set으로 변환불가
        * 동명이인이 없을 경우 중복을 허용하지 않는 Set을 사용하는게 더 빠르다.
        */
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));

        for (String c : completion) {
            participantList.remove(c);
        }

        return participantList.iterator().next();
    }
}
