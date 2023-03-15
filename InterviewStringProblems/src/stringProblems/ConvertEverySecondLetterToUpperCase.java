package stringProblems;

public class ConvertEverySecondLetterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HarshRajShrivastava";
		String m = "";
		char ch;
		for(int i = 0; i < s.length(); i++)
		{
			if(i % 2 != 0) 
			{
				 ch=Character.toUpperCase(s.charAt(i));
			}
			else
				 ch = Character.toLowerCase(s.charAt(i));
			m = m+Character.toString(ch);
		}
		System.out.println(m);
	}

}
