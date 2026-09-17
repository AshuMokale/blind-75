package arraysAndHashing;

/**
 * Write a function to find the longest common prefix string amongst an array
 * of strings.<br>
 * If there is no common prefix, return an empty string ""<br>
 * <a href="https://leetcode.com/problems/longest-common-prefix/description/">Proble Statement</a>
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		// String[] strings = { "flower", "flow", "flight" };
		String[] strings = { "dog", "racecar", "car" };
		var result = new LongestCommonPrefix().longestCommonPrefix(strings);
		System.out.println(result);
	}

	public String longestCommonPrefix(String[] strings) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < strings[0].length(); i++) {
			for (String str : strings) {
				if (i == strings[0].length() || str.charAt(i) != strings[0].charAt(i)) {
					return new String(result);
				}
			}
			result.append(strings[0].charAt(i));
		}
		return new String(result);
	}
}