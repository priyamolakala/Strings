package test;

public class CompressedString {

	public static void main(String[] args) {
		System.out.println(compression("aaabbbbbbcddddeeeeeff"));

	}
	public static String compression(String s) {
		String compressed = "";
		int countcompressed = 0;
		for(int i = 0; i < s.length(); i++) {
			countcompressed++;
			
		if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
			compressed = compressed + s.charAt(i) + countcompressed;
			countcompressed = 0;
		}
		}
		return compressed.length() < s.length() ? compressed : s;
	}
}
