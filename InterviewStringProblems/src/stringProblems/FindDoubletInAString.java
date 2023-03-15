package stringProblems;

public class FindDoubletInAString {
	public static void main(String[] args) 
	{
		String doublet= "HharrshRRajjKumarr".toUpperCase();
		for(int i = 0; i < doublet.length()-1;i++) 
		{
			char first_count = doublet.charAt(i);
			char Consecutive_count = doublet.charAt(i+1);
			if (first_count == Consecutive_count) {
				System.out.println(first_count);
			}
		}

	}

}
