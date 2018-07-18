package test;

public class StringSubstring {

	public static void main(String[] args) {
		
		System.out.println(subofString("waterbottle", "erbottlewat"));
		System.out.println(subofString("why", "erbottlewat"));
	}
	public static boolean subofString(String s1, String s2) {
		int len = s1.length();
		if(s2.length() == len && len > 0) {
			String sub = s1 + s1;
			return isSubstring(sub, s2);
		}
		return false;
	}
	public static boolean isSubstring(String s1, String s2) {
		if(s1.contains(s2)) {
			return true;
		}
		return false;
	}
}

