

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d= new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getData1();
		getData2();
				

	}
		
	public String getData() {
		System.out.println("Hi Harish");
		
		return "Harish";
		
		// method return type string then only we are able to return only in method and in main method we need to mention String name before object and addprint the return Statement.
	}
	
	public static String getData2() {
		System.out.println("Hi Harish");
		
		return "Harish";
		
	}
	
}
