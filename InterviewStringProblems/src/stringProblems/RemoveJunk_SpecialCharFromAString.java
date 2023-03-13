package stringProblems;

public class RemoveJunk_SpecialCharFromAString {

	public static void main(String[] args) {

		//using regular expression
		String s = "#$%*+ Java @*& Testing123";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	}
}
