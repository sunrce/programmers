package programmers_258712;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        /*
        * @var friendNumber friends 배열의 값을 숫자로 변환시키기 위해 정의. friends 배열의 순서대로 값이 1씩 증가한다.
        * @var giveGift     준 선물의 갯수에 관한 배열 - ex) giveGift[1][2] = 2번째 친구가 3번째 친구에게 준 선물의 갯수
        * @var giftIndex    선물지수, friends 배열 순서대로 각 선물지수가 정의
        * @var nextGift     다음달에 받을 선물의 갯수를 정의한 배열, friends 배열 순서대로 다음 달 받는 선물의 갯수이다.
        */
        int answer = 0;

        Map<String, Integer> friendNumber = new HashMap<>();

        int[][] giveGift = new int[friends.length][friends.length];
        int[] giftIndex = new int[friends.length];
        int[] nextGift = new int[friends.length];

        int index = 0;

        for (String friend : friends) {
            friendNumber.put(friend, index++);
        }

        for (String gift : gifts) {
            String[] giftArr = gift.split(" ");

            giveGift[friendNumber.get(giftArr[0])][friendNumber.get(giftArr[1])]++;
            giftIndex[friendNumber.get(giftArr[0])]++;
            giftIndex[friendNumber.get(giftArr[1])]--;
        }

        /*
        다음 달 받을 선물의 갯수를 구하는 로직
        */
        for (int i=0; i<giveGift.length; i++) {
            for (int j=i+1; j<giveGift[i].length; j++) {
                if (giveGift[i][j] > giveGift[j][i]) nextGift[i]++;
                else if (giveGift[i][j] < giveGift[j][i]) nextGift[j]++;
                else {

                    if (giftIndex[i] > giftIndex[j]) nextGift[i]++;
                    else if (giftIndex[i] < giftIndex[j]) nextGift[j]++;
                }
            }
        }

        answer = Arrays.stream(nextGift).max().getAsInt();

        return answer;
    }

}