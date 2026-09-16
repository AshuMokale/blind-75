package arraysAndHashing;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * You are given an array of integers nums and an integer target, return
 * indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * You can return the answer in any order.<br>
 * <a href="https://leetcode.com/problems/two-sum/description/">Problem
 * Statement</a>
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] result = new TwoSum().twoSum(new int[] { 1, 2, 3, 4}, 7);
		System.out.println(Arrays.toString(result));
	}

	/**
	 * Efficient approach using 1 pass through the array while checking if the
	 * difference between target & the current element exists in the HashMap. If
	 * it does exist return the index of that element and current element.<br>
	 * Time & Space complexity O(n).
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> sum = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (sum.containsKey(difference)) {
				int index = sum.get(difference);
				return new int[] { index, i };
			}
			sum.put(nums[i], i);

		}
		return new int[] {};
	}

	/**
	 * Brute force approach checking each element with the rest to match with
	 * the target.<br>
	 * Time complexity O(n^2).
	 */
	// public int[] twoSum(int[] nums, int target) {
	// 	int[] result = new int[2];
	// 	for (int i = 0; i < nums.length; i++) {
	// 		for (int k = i + 1; k < nums.length; k++) {
	// 			int sum = nums[i] + nums[k];
	// 			if (sum == target) {
	// 				result[0] = i;
	// 				result[1] = k;
	// 				break;
	// 			}
	// 		}
	// 	}
	// 	return result;
	// }
}