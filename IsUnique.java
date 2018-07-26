package test;

public class Testing {

	public static void main(String[] args) {
		Testing t = new Testing();
		System.out.println(t.isUnique("Priyanka"));
		System.out.println(t.isUnique("aeiou"));
	}
	public boolean isUnique(String s) {
		if(s.length()> 128) { return false;}
		boolean[] char_set = new boolean[128]; 
//		When the string is considered to be ASCII
		for(int i=0; i < s.length(); i++) {
			int value = s.charAt(i);
			if(char_set[value]) { // if the character is already present in the array
				return false;
			}
			char_set[value] = true;
			
				
	}
		return true;
}
}
