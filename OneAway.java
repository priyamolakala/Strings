package test;

public class OneAway {

	public static void main(String[] args) {
		OneAway o =new OneAway();
		System.out.println(o.edit("apple", "apble"));
		System.out.println(o.edit("apple", "aple"));
		System.out.println(o.edit("male", "maple"));
		System.out.println(o.edit("Priyanka","Priyanka"));

	}
	
	public boolean edit(String s1, String s2) {
		if(s1.length() == s2.length()) {
			return oneEditAway(s1, s2);
		}
		if(s1.length() == s2.length() + 1) {
			return oneInsertAway( s1,  s2);
		}
		if(s1.length() + 1 == s2.length()) {
			return oneInsertAway( s2,  s1);
		}
		return false;
	}
	
	public static boolean oneEditAway(String s1, String s2) {
		boolean foundChar = false;
		if(s1 == s2) { return false; }
		for(int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundChar) {
					return false;
				}
				foundChar = true;
			}
			
		}
		return true;
	}
	
	public static boolean oneInsertAway(String s1, String s2) {
		int index1 = s1.length(); int index2 = s2.length();
		while(s1.length() < index1 && s2.length() < index2) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}

}
