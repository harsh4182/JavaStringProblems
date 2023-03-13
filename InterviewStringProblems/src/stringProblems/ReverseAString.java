package stringProblems;

public class ReverseAString {

	public static void main(String[] args) {
		
		// Reverse a string using For loop
		String s = "harsh raj" ;
		String rev = "" ;
		
		for(int j = s.length()-1; j>=0; j--) {
			rev = rev + s.charAt(j);			
		}
		System.out.println("reverse using For loop:"+rev);
		
		//Reverse a string using StringBuffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println("reverse using StringBuffer class:"+sf.reverse());
	}

}
