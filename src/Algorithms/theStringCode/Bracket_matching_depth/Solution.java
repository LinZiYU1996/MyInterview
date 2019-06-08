package Algorithms.theStringCode.Bracket_matching_depth;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:14 2019/6/8
 */
public class Solution {

        public static int S(String s){

                int cnt = 0, max = 0, i;
                for (i = 0; i < s.length(); ++i) {
                        if (s.charAt(i) == '(')
                                cnt++;
                        else
                                cnt--;
                        max = Math.max(max, cnt);
                }

                return max;

        }


}
