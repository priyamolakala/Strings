package test;

public class BinaryCalc {
	
	public static String binarycalc(String a, String b) {
		int i = a.length()-1; int j = b.length()-1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while(i>=0 || j>=0){
			int sum = carry;
			if(i>=0) {
				sum+= a.charAt(i--) - '0';
			}
			if(j>=0) {
				sum+=b.charAt(j--) - '0';
			}
			 sb.append(sum%2);  
			carry = sum / 2;
		}
		if(carry!=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(binarycalc("11", "1"));
	}

}
