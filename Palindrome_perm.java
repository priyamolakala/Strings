package test;

public class Palindrome_perm {

	public static void main(String[] args) {
		Palindrome_perm Obj = new Palindrome_perm();
		System.out.println(Obj.isPalindrome("tactcoapapa"));
		System.out.println(Obj.isPalindrome("Priyanka"));

	}
	public boolean isPalindrome(String word) {
		int[] table = createArray(word);
		return checkForOdd(table);
		
		
	}
	public static boolean checkForOdd(int[] table) {
		boolean foundOdd =  false;
		for(int count : table) {
			if(count % 2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			} 
		}
		return true;
	}
	public static int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int x = Character.getNumericValue(c);
		if(a<=x && x<=z) {
			return x - a; 
		}
		return -1;
	}

	public static int[] createArray(String s) {
		int[] table = new int[Character.getNumericValue('z')- Character.getNumericValue('a') + 1];
		for(char c: s.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	
	
		
		
	}

