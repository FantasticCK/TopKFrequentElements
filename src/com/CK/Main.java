package com.CK;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] words = new int[]{1, 1, 1, 2, 3, 3};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.topKFrequent(words, k).toString());
    }
}

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap();
        for (Integer num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>(count.keySet());
        Collections.sort(res, (num1, num2) -> count.get(num2) - count.get(num1));

        return res.subList(0,k);
    }

}