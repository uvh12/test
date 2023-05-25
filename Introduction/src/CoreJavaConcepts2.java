
public class CoreJavaConcepts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Strings are Objects
		
		//String literal - only one object will be keyword
		
		//String s = "Harish Venkata Utpala";
		String s1 = "Harish Venkata Utpala";
		
		// new keyword - new object will be created
		
		String s2 = new String("Welcome");
		String s4 = new String("Welcome");
		
		
		String s = "Harish Venkata Utpala";
		String[] SplittedString = s.split("Venkata");
		//System.out.println(SplittedString[0]);
		//System.out.println(SplittedString[1]);
		//System.out.println(SplittedString[2]);
		
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[1].trim());
//		for (int i=0; i<s.length();i++) 
//		{
//			System.out.println(s.charAt(i));
//		}
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
//		You have to build that string is an object that represents sequence of characters.
//
//		And next question how many ways you can define string?
//
//		You can define string in two ways What is the string literal?
//
//		And another one is using new memory allocate operator.
//
//		You can also declare string like this in both of it.
//
//		The value of whatever you see will get stored in this object or you got it as a variable, whatever.
//
//		Now what is the difference between declaring like this and this one?
//
//		So in string literal.
//
//		Basically, if you have same multiple values with the same name, then it won't create new object.
//
//		It will refer to the existing.
//
//		But here, no matter if it is the same string value, it will still explicitly create new object in
//
//		the memory space.
//
//		OK.
		
		// charAt Method : 
//		OK, so what does this do?
//
//				If you pass your index, it will give you the character present on that index.
//
//				Now, when you give zero, that one's character is zero, which is, ah, OK, this is on zero index
//
//				one two three four like that?
//
//				OK.
//
//				So this character, it will give you that letter, which is present in that index.
//
//				In this case, I'll put it right.
//
//				OK, so that way it will enter it in the first index, zero will come.
//
//				So the character will print out.
//
//				Again, Loop generates the loop continues until it reaches the length of this string.
//
//				So until this way.
		
	}

}
