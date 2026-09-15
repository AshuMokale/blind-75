package arraysAndHashing;

import java.util.Map;
import java.util.HashMap;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.<a href="https://leetcode.com/problems/valid-anagram/description/">Problem Statement</a>
 */
public class ValidAnagrams {
	public static void main(String[] args) {
		String s = "jar";
		String t = "tab";

		ValidAnagrams anagram = new ValidAnagrams();
		System.out.println(anagram.isAnagram(s, t));
	}

	/**
	 * Most efficient approach by counting the frequency of each character and
	 * then comparing both HashMaps. Time complexity is O(n).
	 */
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}

		return sMap.equals(tMap);
	}
}