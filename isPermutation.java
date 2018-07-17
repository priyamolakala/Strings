package test;

public class SortStrings {

	public static void main(String[] args) {
		SortStrings str = new SortStrings();
		System.out.println(str.isPermutation("taco", "cato"));
		System.out.println(str.isPermutation("abcd", "dabc"));
		System.out.println(str.isPermutation("Priyanka", "Simran"));
		
	}
	public static String sort(String s) {
		char[] word = s.toCharArray();
		java.util.Arrays.sort(word);
		return new String(word);
		
	}
	public boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		s1 = sort(s1);
		s2 = sort(s2);
		return s1.equals(s2);
		
	}
}
