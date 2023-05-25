
public class CoreJavaConcepts {

	public static void main(String[] args) {
		//Variable and DataTypes
		
		int abc=5;
		System.out.println(abc + "is the integer");
		
		char a='h';
		System.out.println(a);
		
		String b="Harish";
		System.out.println(b);
		
		double d = 9.9;
		System.out.println(d);
		
		boolean Card = true;
		
		System.out.println(Card);
		
		//Arrays
		
		//1st approach
		
		int[] array = new int[6];
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		
		//2nd approach
		
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(array[0]);
		
		System.out.println(array1[3]);
		
		// For Loops
		
		//array length size -1
		
		for (int i=0; i<array.length; i++) 
		{
			
			System.out.println(array[i]);
		}
		
		
		for (int i=0; i<array1.length; i++) 
		{
			System.out.println(array1[i]);
		}
		
		//String array 
		//1.
		String[] name = {"abc","def","ghi"} ;
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//2. 
		
		for (String S:name)
		{
			System.out.println(S);
			
		}
		
		


	}

}
