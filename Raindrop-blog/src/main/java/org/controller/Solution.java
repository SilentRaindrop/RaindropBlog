package org.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: silence
 * @date: 2024年03月20日
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max = 0;
        for(int i=0;i<s.length();i++) {
            if(list.contains(s.charAt(i))) {
                max = Math.max(max,list.size());
                list.clear();
            } else {
                list.add(s.charAt(i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLongestSubstring("dvdf");
    }
}