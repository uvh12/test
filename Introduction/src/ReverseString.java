
public class ReverseString {

	public static void main(String[] args) {

		String h = "Arnav Simaha";
		for (int i=h.length()-1;i>=0;i--)
		{
			System.out.println(h.charAt(i));
		}
		
		for (int i=0; i<h.length();i++)
		{
			System.out.println(h.charAt(i));
		}
	}

}
