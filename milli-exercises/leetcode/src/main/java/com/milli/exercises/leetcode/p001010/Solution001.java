package com.milli.exercises.leetcode.p001010;

import java.util.Hashtable;
import java.util.Map;


public class Solution001 {
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

class Solution001Ex {
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