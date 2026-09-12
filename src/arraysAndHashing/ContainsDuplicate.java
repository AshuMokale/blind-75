package arraysAndHashing;

import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * <a href=
 * "https://leetcode.com/problems/contains-duplicate/description/">Problem
 * Statement</a>
 */

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.hasDuplicate(nums));
	}

	/**
	 * Efficient approach using HashSet, this algorithm loops through the
	 * array and checks if the number exists in the HashSet. If it does it
	 * returns true or else adds that number
	 * in the HashSet and finally after the loop returns false.<br>
	 * 
	 * Time & Space complexity = O(n)
	 */
	public boolean hasDuplicate(int[] nums) {
		HashSet<Integer> numbers = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (numbers.contains(nums[i]))
				return true;
			numbers.add(nums[i]);
		}
		return false;
	}
}