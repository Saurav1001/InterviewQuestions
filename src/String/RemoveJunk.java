package String;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="!@#$%^&^% testing 12378908";
		s=s.replaceAll("[^a-zA-Z0-9]", "");//use regular expression
		System.out.println(s);

	}

}
