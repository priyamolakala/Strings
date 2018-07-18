package test;

public class UrlIfy {
	int spaces = 0; 
	


	public static void main(String[] args) {
		UrlIfy u = new UrlIfy();
		u.count_spaces(new char[] {'a',' ','b',' ','c',' ','d','e','f',' ','g'}, 11);
	}
	public void count_spaces(char[] s, int truelength) {
		
		for(int i = 0; i < truelength; i++) {
			if(s[i] == ' ') {
				spaces++;
		}
			System.out.println("The number of spaces is" + spaces);
	}
		int index = truelength + 2 * spaces;
		int[] new_array = new int[index];
		System.out.println(index);
		
		if(truelength < s.length) {
			if(s[truelength] == '\0');{
			System.out.println("End of Array");
		} 
		
	}
		
			for (int i = truelength - 1; i >= 0; i--) {
				if(s[i] == ' ') {
					new_array[index - 1] = '0';
					new_array[index - 2] = '2';
					new_array[index - 3] = '%';
					index = index - 3;
					
				}
				else {
				new_array[index - 1] = s[i];
				index--;
			}
		
				
			
		}
			
}
}

