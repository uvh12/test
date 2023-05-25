import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaConcepts1 {

	public static void main(String[] args) {
		//If condition
		
		//multiple of 2 
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<array.length; i++)
		{
			if (array[i] % 2 ==0) {
			System.out.println(array[i] + "is multiple of 2");
			break;
			}
			else {
				System.out.println(array[i] + "is not multiple of 2");
			}
		}
		
		//ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("hari");
		a.add("bhavya");
		System.out.println(a.get(1));
		
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		for (String val :a) 
		{
			System.out.println(val);
		}
		
		//item is present in ArrayList
		
		System.out.println(a.contains("hari"));
		String[] name = {"abc","def","ghi"} ;
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("abc");

	}

}
