package com.milli.exercises.leetcode.p01;

import java.util.Hashtable;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution02();
        // example01
        for (int i : solution.twoSum(new int[]{3, 2, 4}, 6)) {
            System.out.println(i);
        }

        // example02
        for (int i : solution.twoSum(new int[]{3, 3}, 6)) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }

        return new int[]{};
    }
}

class Solution02 extends Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}